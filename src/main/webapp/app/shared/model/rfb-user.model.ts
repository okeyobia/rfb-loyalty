export interface IRfbUser {
  id?: number;
  userName?: string;
  homeLocationId?: number;
}

export class RfbUser implements IRfbUser {
  constructor(public id?: number, public userName?: string, public homeLocationId?: number) {}
}
