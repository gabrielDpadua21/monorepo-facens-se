import { Body, Controller, Get, Post, UseGuards, Param } from '@nestjs/common';
import { CreateGamesDto } from './dto/create-game.dto';
import { Games } from './games.entity';
import { GamesService } from './games.service';
import { FindGamesQueryDto } from './dto/find-games-query.dto';
import { AuthGuard } from '@nestjs/passport';
import { RolesGuard } from 'src/auth/roles.guard';
import { UserRole } from 'src/users/enums/users-role.enum';
import { Role } from 'src/auth/role.decorator';
import { GetUser } from 'src/auth/get-user.docorator';
import { User } from 'src/users/users.entity';
import { UserGames } from './user-games.entity';
import { MyGamesDto } from './dto/my-games.dto';

@Controller('games')
export class GamesController {
  constructor(private gamesService: GamesService) {}

  @Post()
  async create(
    @Body() createGamesDto: CreateGamesDto,
  ): Promise<{ data: Games }> {
    const game = await this.gamesService.create(createGamesDto);
    return {
      data: game,
    };
  }

  @Get()
  @UseGuards(AuthGuard(), RolesGuard)
  @Role(UserRole.USER)
  async findUsers(
    @Body() findGamesQueryDto: FindGamesQueryDto,
  ): Promise<{ games: Games[]; total: number }> {
    const games = await this.gamesService.findGames(findGamesQueryDto);
    return games;
  }

  @Get('/my')
  @UseGuards(AuthGuard(), RolesGuard)
  @Role(UserRole.USER)
  async findMyGames(@GetUser() user: User): Promise<MyGamesDto[]> {
    const mygames = await this.gamesService.findMyGames(user.id);
    return mygames;
  }

  @Post('/buy/:id')
  @UseGuards(AuthGuard(), RolesGuard)
  @Role(UserRole.USER)
  async buyGames(
    @GetUser() user: User,
    @Param('id') id: string,
  ): Promise<UserGames> {
    const result = await this.gamesService.buy(id, user);
    return result;
  }

  @Post('/percent/:id')
  @UseGuards(AuthGuard(), RolesGuard)
  @Role(UserRole.USER)
  async updatePercent(
    @GetUser() user: User,
    @Param('id') id: string,
  ): Promise<UserGames> {
    const result = await this.gamesService.updatePercent(id, user);
    return result;
  }
}
