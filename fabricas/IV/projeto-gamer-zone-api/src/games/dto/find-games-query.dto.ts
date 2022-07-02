import { BaseQueryParamsDto } from '../../shared/dto/base-query-params.dto';

export class FindGamesQueryDto extends BaseQueryParamsDto {
  name?: string;

  constructor(name?: string) {
    super();
    this.name = name;
  }
}
