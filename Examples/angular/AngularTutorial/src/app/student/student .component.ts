import { Component } from "@angular/core";


@Component(
    {
        selector:'app-student',
        templateUrl:'student.component.html'
    }
)
export class StudentComponent
{
    firstName: string = "Megha";
    lastName: string = "Akshay";
    gender: string="Female"
    age: number=21; 
}