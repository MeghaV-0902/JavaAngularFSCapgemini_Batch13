import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProdListComponent } from './prod-list/prod-list.component';
import { RouterModule, Routes} from '@angular/router'
//import{appRoutes} from './routerConfig';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProdListComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([{path: 'home',component: HomeComponent},
    {path: 'prod-list',component: ProdListComponent}
  ]),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
