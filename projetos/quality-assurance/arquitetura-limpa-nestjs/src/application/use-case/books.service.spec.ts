import { Test, TestingModule } from '@nestjs/testing';
import { Books } from '../../domain/entity/books.entity';
import { BooksService } from './books.service';
import { CreateBookDto } from '../dtos/create-books.dto';
import { BooksRepository } from '../../infra/repository/books.repository';

const mockBooksRepository = () => ({
  createBook: jest.fn(),
  findBooks: jest.fn(),
});

describe('BooksService', () => {
  let service;
  let repository;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [
        BooksService,
        {
          provide: BooksRepository,
          useFactory: mockBooksRepository,
        },
      ],
    }).compile();

    service = module.get<BooksService>(BooksService);
    repository = module.get<BooksRepository>(BooksRepository);
  });

  it('should be books services and repositorys be defined', () => {
    expect(service).toBeDefined();
  });

  describe('Books test', () => {
    let mockCreateBooksDto: CreateBookDto;
    let book: Books;

    beforeAll(() => {
      mockCreateBooksDto = new CreateBookDto(
        'mock',
        'mock',
        'mock',
        new Date(),
      );
      book = new Books();
      book.id = 1;
    });

    it('Should create a book', async () => {
      repository.createBook.mockResolvedValue('mockbook');
      const book = await service.create(mockCreateBooksDto);
      expect(repository.createBook).toHaveBeenCalledWith(mockCreateBooksDto);
      expect(book).toEqual('mockbook');
    });

    it('Should find all books', async () => {
      repository.findBooks.mockResolvedValue([book]);
      const books = await service.findAll();
      expect(repository.findBooks).toBeCalled();
      expect(books.length).toEqual(1);
    });
  });
});
