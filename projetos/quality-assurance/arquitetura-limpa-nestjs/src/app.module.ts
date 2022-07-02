import { Module } from '@nestjs/common';
import { BooksModule } from './application/modules/books.module';
import { TypeOrmModule } from '@nestjs/typeorm';
import { typeOrmConfig } from './infra/config/typeorm.config';

@Module({
  imports: [TypeOrmModule.forRoot(typeOrmConfig), BooksModule],
  controllers: [],
  providers: [],
})
export class AppModule {}
