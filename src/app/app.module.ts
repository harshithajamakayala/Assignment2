import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminWorkComponent } from './admin-work/admin-work.component';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';

const allLinks:Routes = [
  {path:'launchrestuarant',component:AdminWorkComponent},
  {path:'restaurants',component:UserComponent},
  
]


@NgModule({
  declarations: [
    AppComponent,
    AdminWorkComponent,
    UserComponent,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allLinks),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
