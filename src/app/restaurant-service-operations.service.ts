import { Injectable } from '@angular/core';
import { Restaurant } from './restaurant';

@Injectable({
  providedIn: 'root'
})
export class RestaurantServiceOperationsService {

  constructor() { }
  restaurantArr:Restaurant[]=[];

  addRestaurants(restaurantFromUser:Restaurant){
    this.restaurantArr.push(restaurantFromUser); 
    console.log("Inside Restaurant Service : Restuarant Added "+restaurantFromUser.restaurantName);
    console.log(" Total Restaurant Are :- "+this.restaurantArr.length);
  }

  getRestaurantArr():Restaurant[]
  {
    return this.restaurantArr;
  }

}
