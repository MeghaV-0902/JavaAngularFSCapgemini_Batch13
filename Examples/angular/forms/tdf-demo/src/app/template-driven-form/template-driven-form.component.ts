import { Component, OnInit } from '@angular/core';
import { Registration } from '../data/registration';

@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.css']
})
export class TemplateDrivenFormComponent implements OnInit {

  registration: Registration=
  {
    name:null,
    notification:null,
    alerts: null,
    gender:null,
    subscriptionType:null,
    notes:null
  }
  constructor() { }

  ngOnInit(): void {
  }

}
