import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  users: Object | undefined;
  constructor(private Data: DataService) { }
  
  h1style: boolean = false;
  ngOnInit(): void {
    this.Data.getUsers().subscribe(data=>{
      this.users=data
      console.log(this.users)
    })
  }


}
