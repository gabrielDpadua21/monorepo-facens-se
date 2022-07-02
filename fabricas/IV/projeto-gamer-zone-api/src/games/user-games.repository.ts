import {
  InternalServerErrorException,
  NotFoundException,
} from '@nestjs/common';
import { User } from 'src/users/users.entity';
import { EntityRepository, Repository } from 'typeorm';
import { MyGamesDto } from './dto/my-games.dto';
import { Games } from './games.entity';
import { UserGames } from './user-games.entity';

@EntityRepository(UserGames)
export class UserGamesRepository extends Repository<UserGames> {
  async createUserGames(user: User, game: Games): Promise<UserGames> {
    const userGame = this.create();
    userGame.game = game;
    userGame.user = user;
    try {
      await userGame.save();
      return userGame;
    } catch (err) {
      throw new InternalServerErrorException('Error to save data in database');
    }
  }

  async findMyGameById(id: string): Promise<UserGames> {
    const userGame = this.findOne(id);
    if (!userGame) throw new NotFoundException('Game not found');
    return userGame;
  }

  async updateUserGamesPercent(userGame: UserGames): Promise<UserGames> {
    try {
      await userGame.save();
      return userGame;
    } catch (err) {
      throw new InternalServerErrorException('Error to save data');
    }
  }

  async findMyGames(userId: string): Promise<MyGamesDto[]> {
    const myGames = await this.createQueryBuilder('user_games')
      .innerJoinAndSelect('user_games.game', 'games')
      .innerJoin('user_games.user', 'u')
      .where('u.id = :id', { id: userId })
      .getMany();
    const gamesDto = myGames.map((game: UserGames) => {
      return new MyGamesDto(
        game.id,
        game.game.name,
        game.game.category,
        game.progress,
        game.game.imageUrl,
      );
    });
    return gamesDto;
  }
}
