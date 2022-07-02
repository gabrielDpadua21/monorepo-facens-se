import {
  BaseEntity,
  Column,
  CreateDateColumn,
  DeleteDateColumn,
  Entity,
  OneToMany,
  PrimaryGeneratedColumn,
  UpdateDateColumn,
} from 'typeorm';
import { UserGames } from './user-games.entity';

@Entity()
export class Games extends BaseEntity {
  @PrimaryGeneratedColumn('uuid')
  id: string;

  @OneToMany((type) => UserGames, (userGames) => userGames.game)
  userGames: UserGames[];

  @Column({ nullable: false, type: 'varchar', length: 200 })
  name: string;

  @Column({ nullable: false, type: 'varchar', length: 300 })
  description: string;

  @Column({ nullable: false, type: 'numeric', default: 0.0 })
  price: number;

  @Column({ nullable: true, type: 'varchar', length: 250 })
  imageUrl: string;

  @Column({ nullable: false, type: 'varchar', length: 200 })
  category: string;

  @Column({ nullable: true, type: 'varchar', length: 200 })
  publishedAt: string;

  @CreateDateColumn({ select: false })
  createdAt: Date;

  @UpdateDateColumn({ select: false })
  updatedAt: Date;

  @DeleteDateColumn({ select: false })
  deletedAt: Date;
}
