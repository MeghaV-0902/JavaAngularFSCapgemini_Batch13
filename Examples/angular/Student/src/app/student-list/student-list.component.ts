import { Component, OnInit } from '@angular/core';
import { StudentListService } from './student-list.service';
import { IStudent } from './studentList';
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css'],
  providers: [StudentListService]
})
export class StudentListComponent implements OnInit {

  students: IStudent[];

  constructor(private _studentListService: StudentListService) { 
    this.students = _studentListService.getStudents();
  }

  ngOnInit(): void {
  }

}
