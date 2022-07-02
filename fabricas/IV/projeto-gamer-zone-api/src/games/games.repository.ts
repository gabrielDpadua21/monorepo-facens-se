import {
  InternalServerErrorException,
  NotFoundException,
} from '@nestjs/common';
import { EntityRepository, Repository } from 'typeorm';
import { CreateGamesDto } from './dto/create-game.dto';
import { Games } from './games.entity';
import { FindGamesQueryDto } from './dto/find-games-query.dto';

@EntityRepository(Games)
export class GamesRepository extends Repository<Games> {
  async createGame(createGameDto: CreateGamesDto): Promise<Games> {
    const { name, description, imageUrl, category, price, publishedAt } =
      createGameDto;
    const game = this.create();
    game.name = name;
    game.description = description;
    game.imageUrl = imageUrl;
    game.category = category;
    game.price = price;
    game.publishedAt = publishedAt;
    try {
      await game.save();
      return game;
    } catch (err) {
      throw new InternalServerErrorException('Error to save game in database');
    }
  }

  async findGames(
    queryDto: FindGamesQueryDto,
  ): Promise<{ games: Games[]; total: number }> {
    queryDto.page = queryDto.page ?? 1;
    queryDto.limit = queryDto.limit ?? 50;
    const { name } = queryDto;
    const query = this.createQueryBuilder('games');
    if (name) query.where('games.name ILIKE :name', { name: `%${name}%` });
    query.skip((queryDto.page - 1) * queryDto.limit);
    query.take(+queryDto.limit);
    query.orderBy(queryDto.sort ? JSON.parse(queryDto.sort) : undefined);
    query.select([
      'games.id',
      'games.name',
      'games.description',
      'games.imageUrl',
      'games.category',
      'games.publishedAt',
      'games.price',
    ]);
    const [games, total] = await query.getManyAndCount();
    return { games, total };
  }

  async findGamesById(gameId: string): Promise<Games> {
    const game = await this.findOne(gameId);
    if (!game) throw new NotFoundException('Game not found');
    return game;
  }
}
