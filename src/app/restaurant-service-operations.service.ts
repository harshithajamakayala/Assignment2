import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Restaurant } from './restaurant';
import { Observable } from 'rxjs';
import { RestaurantDto } from './restaurant-dto';

@Injectable({
  providedIn: 'root'
})
export class RestaurantServiceOperationsService {

  constructor(private http:HttpClient) { }
  restaurantArr:Restaurant[]=[];
  restaurantArr2:RestaurantDto[]=[];

  //localhost:2023/restaurant/register
  baseURL:string = 'http://localhost:2022';
  submitRestaurantEndPoint:string=this.baseURL+'/restaurant/register';
  getAllRestaurantsEndPoint:string=this.baseURL+'/restaurant/list';
  getAllRestaurantByCityEndPoint:string=this.baseURL+'/restaurant/resbycity';
  getAllRestaurantByStateEndPoint:string=this.baseURL+'/restaurant/resbystate';

  getRestaurantArr():Restaurant[]
  {
    return this.restaurantArr;
  }
   getRestaurantDtoArr():RestaurantDto[]{
    return this.restaurantArr2;
   }

  submitRestaurant(restaurant: Restaurant):Observable<Restaurant> {

    console.log("inside method 1 : Restauarant added" +restaurant);
    console.log(restaurant.restaurantName);
    
    
    return this.http.post<Restaurant>(`${this.submitRestaurantEndPoint}`,restaurant);
    
  }

  getAllRestaurants():Observable<RestaurantDto[]>{
    console.log("inside get method 1 : Restauarant "+this.getAllRestaurantsEndPoint);
    return this.http.get<RestaurantDto[]>(`${this.getAllRestaurantsEndPoint}`);

  }

 getAllRestaurantsByCity(city:string):Observable<RestaurantDto[]>{
  console.log("inside get city method:"+this.getAllRestaurantByCityEndPoint);
  this.getAllRestaurantByCityEndPoint=this.getAllRestaurantByCityEndPoint+'/'+city;
  return this.http.get<RestaurantDto[]>(`${this.getAllRestaurantByCityEndPoint}`)
  
 }

 getAllRestaurantsByState(state:string):Observable<RestaurantDto[]>{
  console.log("inside get city method:"+this.getAllRestaurantByStateEndPoint);
  this.getAllRestaurantByStateEndPoint=this.getAllRestaurantByStateEndPoint+'/'+state;
  return this.http.get<RestaurantDto[]>(`${this.getAllRestaurantByStateEndPoint}`)
  
 }

}
