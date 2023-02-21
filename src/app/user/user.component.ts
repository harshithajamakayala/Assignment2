import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Restaurant } from '../restaurant';
import { RestaurantServiceOperationsService } from '../restaurant-service-operations.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  __restaurantService:RestaurantServiceOperationsService;
  router:Router;

  allRestaurants:Array<Restaurant>=[];
 


  constructor(restaurantService:RestaurantServiceOperationsService,router:Router){
    this.__restaurantService=restaurantService;
    this.allRestaurants=this.__restaurantService.getRestaurantArr();
    this.router=router;
  }

}
