import { Component } from '@angular/core';
import { DataOperationService } from './data-operation.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FoodDeliveryApp';
  username:string = '';
  loginUsername:string = '';
  userRole :string = '';
  loginStatus:boolean = false;
  photo:string='';

  __dataService:DataOperationService;

  constructor(dataService:DataOperationService)
  {
    this.__dataService = dataService;
   
  }

  attemptLogin(userId:string,password:string)
  {
    
    if(userId == 'admin' && password == 'admin')
    {
      this.loginStatus = true;
      this.userRole = 'admin';
      localStorage.removeItem('username')
        localStorage.removeItem('role')
        localStorage.setItem("username","admin");
        localStorage.setItem("role","admin");
        console.log("username admin"+this.loginUsername)
        console.log("user role admin "+this.userRole);
        console.log("login status admin"+this.loginStatus);
        
    }
    else
    {
    this.__dataService.doSpringLogin(userId,password).subscribe(
      data =>
      {
        this.loginStatus = true;
        this.userRole = 'User';
        this.loginUsername = data.firstName;
        localStorage.removeItem('username')
        localStorage.removeItem('role')
        localStorage.setItem("username",userId+'');
        localStorage.setItem("role","User");
        console.log("username user "+this.loginUsername)
        console.log("user role user"+this.userRole);
        console.log("login status user"+this.loginStatus);
      }
      ,err=>
      {
        console.log(err);
        
      }
    )
    }
  }


  verifyUser(username:string,password:string)
  {
    console.log("inside component ts : "+username+" & "+password);
    
    this.loginStatus = this.__dataService.doLogin(username,password);
    
    if(this.loginStatus == true)
    {
      // becoz local storage may give u null
      this.userRole =  localStorage.getItem('role') || '';
      this.loginUsername = localStorage.getItem('username') || '';
      this.photo = localStorage.getItem('photo') || '';
      
      console.log("username "+this.loginUsername);
      console.log("user role "+this.userRole);
      
    }
  }

  doLogout()
  {
    this.loginUsername = '';
    this.userRole = '';
    this.loginStatus= false;
    this.photo='';
    this.__dataService.doUserLogout();
  }


}
