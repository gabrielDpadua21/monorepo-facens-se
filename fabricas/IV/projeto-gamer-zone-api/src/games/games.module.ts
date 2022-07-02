import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { GamesService } from './games.service';
import { GamesController } from './games.controller';
import { GamesRepository } from './games.repository';
import { PassportModule } from '@nestjs/passport';
import { UserGamesRepository } from './user-games.repository';

@Module({
  imports: [
    TypeOrmModule.forFeature([GamesRepository, UserGamesRepository]),
    PassportModule.register({ defaultStrategy: 'jwt' }),
  ],
  providers: [GamesService],
  controllers: [GamesController],
})
export class GamesModule {}
