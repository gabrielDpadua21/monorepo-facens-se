export class CreateBookDto {
  name: string;
  author: string;
  category: string;
  publishedAt: Date;

  constructor(
    name: string,
    author: string,
    category: string,
    publishedAt: Date,
  ) {
    this.name = name;
    this.author = author;
    this.category = category;
    this.publishedAt = publishedAt;
  }
}
