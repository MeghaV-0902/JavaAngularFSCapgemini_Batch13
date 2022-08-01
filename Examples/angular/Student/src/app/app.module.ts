import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import { HomeComponent } from './home/home.component';
import { NopagetodisplayComponent } from './nopagetodisplay/nopagetodisplay.component';
import {RouterModule ,Routes } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
const appRoutes: Routes=[
  {path:'home', component:HomeComponent},
  {path:'students', component: StudentListComponent},
  {path:'',redirectTo: '/home',pathMatch:'full'},
  {path:'**', component: NopagetodisplayComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    HomeComponent,
    NopagetodisplayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
