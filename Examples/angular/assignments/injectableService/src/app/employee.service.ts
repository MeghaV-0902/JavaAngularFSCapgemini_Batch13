import { Injectable } from '@angular/core';
//decorator is used to inject other dependecies into the service

export class EmployeeService {

  getEmployees(): any[]{
    return[
      {
        ID:'A101',FirstName : 'Ashu', LastName : 'Johar',
        Department : 'IT', DOB : '29/03/1990', Gender : 'Female'
      },
      {
        ID:'A102',FirstName : 'Dipti', LastName : 'Anjarlekar',
        Department : 'Finance', DOB : '03/08/1992', Gender : 'Female'
      },
      {
        ID:'A103',FirstName : 'Nitya', LastName : 'Reddy',
        Department : 'IT', DOB : '29/03/1995', Gender : 'Male'
      },
      {
        ID:'A104',FirstName : 'Sudha', LastName : 'Joshi',
        Department : 'Logistics', DOB : '08/12/1993', Gender : 'Female'
      },
      {
        ID:'A105',FirstName : 'Manjusha', LastName : 'Kadam',
        Department : 'Account', DOB : '23/01/1995', Gender : 'Female'
      }
    ];
  }
}
