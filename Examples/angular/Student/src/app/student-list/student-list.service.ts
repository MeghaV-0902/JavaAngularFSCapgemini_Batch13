import { Injectable } from '@angular/core';
import { IStudent } from './studentList';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class StudentListService {

  private _url:string='src/assets/data/students.json';

  constructor(private http: HttpClient) 
  { }
  getStudents():Observable<IStudent[]>
  {
    return this.http.get<IStudent[]>(this._url);
  }
}
