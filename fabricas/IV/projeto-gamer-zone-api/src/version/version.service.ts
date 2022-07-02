import { Injectable } from '@nestjs/common';

@Injectable()
export class VersionService {
  version(): string {
    return process.env.VERSION;
  }
}
