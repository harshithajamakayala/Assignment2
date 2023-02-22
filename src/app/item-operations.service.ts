import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Item } from './item';
import { ItemDTO } from './item-dto';
import { Restaurant } from './restaurant';

@Injectable({
  providedIn: 'root'
})
export class ItemOperationsService {


///{itemid}/restaurant/{rid}
  constructor(private http:HttpClient) { }
  baseURL:string = 'http://localhost:2022';
  submitItemEndPoint:string=this.baseURL+'/items/register';
  updateRestuarantWithItemEndPoint:string=this.baseURL+'/items'
  
  getItemArr(){
    return [];
  }
  

  submitItems(items:Item):Observable<Item>{
    console.log("inside the method :"+items);

    return this.http.post<Item>(`${this.submitItemEndPoint}`,items);
  }
 
 updateItemWithRestaurant(itemid:number,restaurantId:number)
 {

  this.updateRestuarantWithItemEndPoint=this.updateRestuarantWithItemEndPoint+'/'+itemid+'/'+restaurantId;
  this.http.put<Item[]>(`${this.updateRestuarantWithItemEndPoint}`,Item)
  
 }

}
