export class ResponseDto {
  data: any;
  message: string;

  constructor(data: any, message: string) {
    this.data = data;
    this.message = message;
  }
}
