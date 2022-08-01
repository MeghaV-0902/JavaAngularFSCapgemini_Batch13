import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[EmployeeService]
})
export class AppComponent {
  employees : any[] | undefined;
  constructor (private _employeeservice:EmployeeService){}
 /* {
    this.employees = this._employeeservice.getEmployees();
  }*/
ngOnInit()
{
  this.employees = this._employeeservice.getEmployees();

}
}