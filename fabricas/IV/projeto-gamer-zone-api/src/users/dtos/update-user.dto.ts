import { IsEmail, IsOptional, IsString } from 'class-validator';
import { UserRole } from '../enums/users-role.enum';

export class UpdateUserDto {
  @IsOptional()
  @IsString({
    message: 'User name invalid',
  })
  name: string;
  @IsOptional()
  @IsEmail(
    {},
    {
      message: 'Mail address invalid',
    },
  )
  email: string;
  @IsOptional()
  status: boolean;
  @IsOptional()
  wallet: number;

  constructor(email: string, name: string, status: boolean, wallet: number) {
    this.email = email;
    this.name = name;
    this.status = status;
    this.wallet = wallet;
  }
}
