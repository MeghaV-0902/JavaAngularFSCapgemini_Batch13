import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
  
})

export class AppComponent 
{
  public switch : boolean = true;
  toggleSwitch()
  {
    this.switch=!this.switch;
  }
  
}
 