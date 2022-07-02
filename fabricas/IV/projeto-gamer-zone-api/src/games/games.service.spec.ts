import { Test, TestingModule } from '@nestjs/testing';
import { GamesService } from './games.service';
import { GamesRepository } from './games.repository';
import { UserGamesRepository } from './user-games.repository';

const mockGamesRepository = () => ({
  createGames: jest.fn(),
  findGames: jest.fn(),
});

const mockGameUserRepository = () => ({});

describe('GamesService', () => {
  let service;
  let repository;
  let userGamesRepository;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [
        GamesService,
        {
          provide: GamesRepository,
          useFactory: mockGamesRepository,
        },
        {
          provide: UserGamesRepository,
          useFactory: mockGameUserRepository,
        },
      ],
    }).compile();

    service = module.get<GamesService>(GamesService);
    repository = module.get<GamesRepository>(GamesRepository);
    userGamesRepository = module.get<UserGamesRepository>(UserGamesRepository);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });
});
