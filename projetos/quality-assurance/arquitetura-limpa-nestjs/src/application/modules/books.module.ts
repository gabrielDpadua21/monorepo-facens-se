import { Module } from '@nestjs/common';
import { BooksService } from '../use-case/books.service';
import { BooksController } from '../../presentation/books.controller';
import { TypeOrmModule } from '@nestjs/typeorm';
import { BooksRepository } from '../../infra/repository/books.repository';

@Module({
  imports: [TypeOrmModule.forFeature([BooksRepository])],
  providers: [BooksService],
  controllers: [BooksController],
})
export class BooksModule {}
