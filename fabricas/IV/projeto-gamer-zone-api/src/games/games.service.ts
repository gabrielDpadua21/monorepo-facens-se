import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { GamesRepository } from './games.repository';
import { CreateGamesDto } from './dto/create-game.dto';
import { Games } from './games.entity';
import { FindGamesQueryDto } from './dto/find-games-query.dto';
import { UserGamesRepository } from './user-games.repository';
import { User } from 'src/users/users.entity';
import { UserGames } from './user-games.entity';
import { MyGamesDto } from './dto/my-games.dto';

@Injectable()
export class GamesService {
  constructor(
    @InjectRepository(GamesRepository)
    private gamesRespository: GamesRepository,
    @InjectRepository(UserGamesRepository)
    private userGamesRespository: UserGamesRepository,
  ) {}

  async create(createGamesDto: CreateGamesDto): Promise<Games> {
    return await this.gamesRespository.createGame(createGamesDto);
  }

  async findGames(
    queryGamesDto: FindGamesQueryDto,
  ): Promise<{ games: Games[]; total: number }> {
    return await this.gamesRespository.findGames(queryGamesDto);
  }

  async findMyGames(userId: string): Promise<MyGamesDto[]> {
    return await this.userGamesRespository.findMyGames(userId);
  }

  async buy(gameId: string, user: User): Promise<UserGames> {
    const game = await this.gamesRespository.findGamesById(gameId);
    const userGame = await this.userGamesRespository.createUserGames(
      user,
      game,
    );
    return userGame;
  }

  async updatePercent(id: string, user: User): Promise<UserGames> {
    const userGame = await this.userGamesRespository.findMyGameById(id);
    userGame.progress += 1;
    return await this.userGamesRespository.updateUserGamesPercent(userGame);
  }
}
