export class Client {

  private id:string;
  private name:string;
  private email:string;
  private age:number;
  private activeProduct:boolean;
  private idProduct:number;


  get _id(): string {
    return this.id;
  }

  set _id(value: string) {
    this.id = value;
  }

  get _name(): string {
    return this.name;
  }

  set _name(value: string) {
    this.name = value;
  }

  get _email(): string {
    return this.email;
  }

  set _email(value: string) {
    this.email = value;
  }

  get _age(): number {
    return this.age;
  }

  set _age(value: number) {
    this.age = value;
  }

  get _activeProduct(): boolean {
    return this.activeProduct;
  }

  set _activeProduct(value: boolean) {
    this.activeProduct = value;
  }

  get _idProduct(): number {
    return this.idProduct;
  }

  set _idProduct(value: number) {
    this.idProduct = value;
  }

}
