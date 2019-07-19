import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Client} from './entity/Client';

@Injectable({
  providedIn: 'root'
})


export class ClientsService{

  constructor(private http: HttpClient) { }


  getClients(){
    return this.http.get("http://localhost:8080/hw2-client-microservice/clients");
  }

  registerClient(client: Client){
    return this.http.post("http://localhost:8080/hw2-client-microservice/clients", JSON.stringify(client), {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    });
  }

}
