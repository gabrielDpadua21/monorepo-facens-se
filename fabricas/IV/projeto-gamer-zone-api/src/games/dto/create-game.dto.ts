export class CreateGamesDto {
  name: string;
  description: string;
  imageUrl: string;
  category: string;
  price: number;
  publishedAt?: string;

  constructor(
    name: string,
    description: string,
    imageUrl: string,
    category: string,
    price: number,
    publishedAt?: string,
  ) {
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.category = category;
    this.price = price;
    this.publishedAt = publishedAt;
  }
}
