import { Injectable } from '@angular/core';
import { IEmployee } from './employeelist';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {

  getEmployees() :IEmployee[]
  {
    return[
      {id: "1",name:"megha",salary:50000},
      {id: "2",name:"akshay",salary:50000},
      {id: "3",name:"varsh",salary:40000},
      {id: "4",name:"maanasa",salary:40000},
    ]
  }
  constructor() { }
}
