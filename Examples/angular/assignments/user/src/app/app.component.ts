import { Component } from '@angular/core';
import { from } from 'rxjs';
import UsersJson from './users.json';
interface USERS
{
  id:number;
  name: string;
  username: string;
  email: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'user';
  users: USERS[] =UsersJson;

  constructor()
  {
    console.log(this.users);
  }
}
