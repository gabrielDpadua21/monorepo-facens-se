import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { BooksRepository } from '../../infra/repository/books.repository';
import { Books } from '../../domain/entity/books.entity';
import { CreateBookDto } from '../dtos/create-books.dto';

@Injectable()
export class BooksService {
  constructor(
    @InjectRepository(BooksRepository)
    private booksRepository: BooksRepository,
  ) {}

  async create(dto: CreateBookDto): Promise<Books> {
    return await this.booksRepository.createBook(dto);
  }

  async findAll(): Promise<Books[]> {
    return await this.booksRepository.findBooks();
  }
}
