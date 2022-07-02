import { InternalServerErrorException } from '@nestjs/common';
import { CreateBookDto } from '../../application/dtos/create-books.dto';
import { Books } from '../../domain/entity/books.entity';
import { EntityRepository, Repository } from 'typeorm';

@EntityRepository(Books)
export class BooksRepository extends Repository<Books> {
  async createBook(createBookDto: CreateBookDto): Promise<Books> {
    const { name, author, category, publishedAt } = createBookDto;
    const book = this.create();
    book.name = name;
    book.author = author;
    book.category = category;
    book.publishedAt = publishedAt;
    try {
      await book.save();
      return book;
    } catch (err) {
      throw new InternalServerErrorException('Error to save data in database');
    }
  }

  async findBooks(): Promise<Books[]> {
    return await this.find();
  }
}
