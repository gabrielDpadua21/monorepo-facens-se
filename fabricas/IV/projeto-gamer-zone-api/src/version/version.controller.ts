import { Controller, Get } from '@nestjs/common';
import { VersionService } from './version.service';

@Controller('version')
export class VersionController {
  constructor(private service: VersionService) {}

  @Get()
  version(): { version: string; status: boolean } {
    const version = this.service.version();
    return {
      version: version,
      status: true,
    };
  }
}
