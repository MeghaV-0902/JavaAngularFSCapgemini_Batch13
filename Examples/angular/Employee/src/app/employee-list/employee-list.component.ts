import { Component, OnInit } from '@angular/core';
import { IEmployee } from './employeelist';
import { EmployeeserviceService } from './employeeservice.service';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
  providers:[EmployeeListComponent]
})
export class EmployeeListComponent implements OnInit {

  employee: IEmployee[];
  constructor(private _service: EmployeeserviceService) {
    this.employee=_service.getEmployees();
    console.log(this.employee)
   }

  ngOnInit(): void {
  }

}
