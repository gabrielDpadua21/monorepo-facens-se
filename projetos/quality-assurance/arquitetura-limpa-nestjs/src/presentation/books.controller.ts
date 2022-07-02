import { Body, Controller, Get, Post } from '@nestjs/common';
import { BooksService } from '../application/use-case/books.service';
import { CreateBookDto } from '../application/dtos/create-books.dto';
import { ResponseDto } from '../application/dtos/response-books.dto';

@Controller('books')
export class BooksController {
  constructor(private booksServices: BooksService) {}

  @Post()
  async create(@Body() dto: CreateBookDto): Promise<ResponseDto> {
    const book = await this.booksServices.create(dto);
    return new ResponseDto(book, 'Create Success');
  }

  @Get()
  async getAll(): Promise<ResponseDto> {
    const books = await this.booksServices.findAll();
    return new ResponseDto(books, 'Find Success');
  }
}
