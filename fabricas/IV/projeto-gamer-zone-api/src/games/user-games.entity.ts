import { User } from '../users/users.entity';
import {
  Entity,
  Unique,
  BaseEntity,
  PrimaryGeneratedColumn,
  Column,
  CreateDateColumn,
  UpdateDateColumn,
  DeleteDateColumn,
  ManyToOne,
} from 'typeorm';
import { Games } from './games.entity';

@Entity()
@Unique('user_game', ['user', 'game'])
export class UserGames extends BaseEntity {
  @PrimaryGeneratedColumn('uuid')
  id: string;

  @ManyToOne((type) => User, (user) => user.userGames)
  user: User;

  @ManyToOne((type) => Games, (game) => game.userGames)
  game: Games;

  @Column({ nullable: true, default: 0 })
  progress: number;

  @CreateDateColumn({ select: false })
  createdAt: Date;

  @UpdateDateColumn({ select: false })
  updatedAt: Date;

  @DeleteDateColumn({ select: false })
  deletedAt: Date;
}
