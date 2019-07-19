import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator, MatSort, MatTableDataSource} from '@angular/material';
import {Client} from '../entity/Client';
import {ClientsService} from '../clients-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private clientsService: ClientsService) {}

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  title: string;
  clients: Client[];
  displayedColumns: string[] = ['name', 'age', 'email'];
  clientsDataSource: MatTableDataSource<Client>;
  register: string;

  ngOnInit() {

    this.title = "Homework 2";
    this.register = "/register";

    this.clientsService.getClients().subscribe((res : Client[]) => {
      this.clients = res;
      this.clientsDataSource = new MatTableDataSource<Client>(this.clients);
      this.clientsDataSource.paginator = this.paginator;
      this.clientsDataSource.sort = this.sort;
    });

  }

  /**
   * Filter clients in table
   * @param filterValue
   */
  applyFilter(filterValue: string) {
    this.clientsDataSource.filter = filterValue.trim().toLowerCase();
    if (this.clientsDataSource.paginator) {
      this.clientsDataSource.paginator.firstPage();
    }

  }

}
