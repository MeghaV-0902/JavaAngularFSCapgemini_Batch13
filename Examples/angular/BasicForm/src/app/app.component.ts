import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  title = 'BasicForm';
  name ='';
  age=0;
  color='';
  information='';

  display()
  {
      this.information =this.name+" "+this.age.toString()+" "+this.color;
      
  }
}
