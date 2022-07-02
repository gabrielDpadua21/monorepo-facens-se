import {
  Body,
  Controller,
  Get,
  Post,
  UseGuards,
  ValidationPipe,
} from '@nestjs/common';
import { AuthGuard } from '@nestjs/passport';
import { User } from 'src/users/users.entity';
import { CreateUserDto } from '../users/dtos/create-user.dto';
import { AuthService } from './auth.service';
import { CredentialsDto } from './dtos/credentials.dto';
import { ResponseSignDto } from './dtos/response-sign.dto';
import { UpdateWalletDto } from './dtos/update-wallet.dto';
import { GetUser } from './get-user.docorator';

@Controller('auth')
export class AuthController {
  constructor(private authService: AuthService) {}

  @Post('/signup')
  async signUp(
    @Body(ValidationPipe) createUserDto: CreateUserDto,
  ): Promise<{ message: string; data: any }> {
    const token = await this.authService.signUp(createUserDto);
    return {
      data: token,
      message: 'Success sign up',
    };
  }

  @Post('/signin')
  async signIn(
    @Body(ValidationPipe) credentialsDto: CredentialsDto,
  ): Promise<ResponseSignDto> {
    return await this.authService.signIn(credentialsDto);
  }

  @Get('/me')
  @UseGuards(AuthGuard())
  getMe(@GetUser() user: User): User {
    return user;
  }

  @Post('/wallet')
  @UseGuards(AuthGuard())
  async setWallet(
    @GetUser() user: User,
    @Body() updateWalletDto: UpdateWalletDto,
  ): Promise<any> {
    return await this.authService.updateWallet(user, updateWalletDto);
  }
}
