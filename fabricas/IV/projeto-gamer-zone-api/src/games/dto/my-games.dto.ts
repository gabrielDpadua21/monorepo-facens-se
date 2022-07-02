export class MyGamesDto {
  id: string;
  name: string;
  category: string;
  progress: number;
  imageUrl: string;

  constructor(
    id: string,
    name: string,
    category: string,
    progress: number,
    imageUrl: string,
  ) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.progress = progress;
    this.imageUrl = imageUrl;
  }
}
