import { Component, OnInit } from '@angular/core';
import {Client} from '../entity/Client';
import {FormControl, FormGroup} from '@angular/forms';
import {ClientsService} from '../clients-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private clientsService: ClientsService) {}

  home: string;
  disabledOptions: boolean;
  client: Client;
  registerForm = new FormGroup({
    name: new FormControl('',[]),
    email: new FormControl('',[]),
    age: new FormControl('',[]),
    product: new FormControl('',[])
  });


  ngOnInit() {
    this.home="/home";
    this.disabledOptions = true;
    this.client = new Client();
  }

  onOpenProductChange(){
    this.disabledOptions = !this.disabledOptions;
  }

  onSubmit() {
    console.log("submit ...");
    this.client._name= this.registerForm.value.name;
    this.client._email = this.registerForm.value.email;
    this.client._age = this.registerForm.value.age;
    this.client._activeProduct = !this.disabledOptions;
    this.client._idProduct = this.registerForm.value.product;
    console.log(JSON.stringify(this.client));
    this.clientsService.registerClient(this.client).subscribe(response => {
      console.log(response);
      window.location.href = "http://localhost:4200/home";
    });
  }

}
