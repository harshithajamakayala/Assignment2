import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Restaurant } from '../restaurant';
import { RestaurantServiceOperationsService } from '../restaurant-service-operations.service';

@Component({
  selector: 'app-admin-work',
  templateUrl: './admin-work.component.html',
  styleUrls: ['./admin-work.component.css']
})
export class AdminWorkComponent implements OnInit {
  __restaurantService: RestaurantServiceOperationsService;
  status = false;
  message = '';
  r: Restaurant = new Restaurant(0,'', '', '', '', '', '', '', '', '','','');

  constructor(restaurantService: RestaurantServiceOperationsService) {
    this.__restaurantService = restaurantService;
  }

  ngOnInit() {
   
    
  }
 
  onSubmit() {
    console.log(this.r);
    
    this.__restaurantService.submitRestaurant(this.r).subscribe(
      
    
      data=>{
        this.status=true;
        this.message="flight review submitted";

      },
      error=>{

      }

    )

  
  }
}
