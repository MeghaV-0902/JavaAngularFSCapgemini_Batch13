import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prod-list',
  templateUrl: './prod-list.component.html',
  styleUrls: ['./prod-list.component.css']
})
export class ProdListComponent implements OnInit {

  prodListCOmponent="Inside product list"
  constructor() { }

  ngOnInit(): void {
  }

}