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
 getAllItemsEndPoint:string=this.baseURL+'/items/list';
  
  getItemArr(){
    return [];
  }
  
//localhost:2022/items/2/restaurant/3
  // submitItems(items:Item,restaurantId:string):Observable<Item>{
  //   console.log("inside the method :"+items);
  //   let updateEndPoint='';
  //   let itemFromDB:Item=new Item(0,'','',0,'');
  //   this.http.post<Item>(`${this.submitItemEndPoint}`,items).subscribe( 
  //     data=>{
  //    itemFromDB=data;
  //    updateEndPoint =this.baseURL+'/items/'+itemFromDB.itemId+'/restaurant/'+restaurantId;
  //    console.log("inside service layer abc "+updateEndPoint);
  //    return this.http.put<Item>(`${updateEndPoint}`,itemFromDB);
     
  //   },
  //   error=>{
      
  //     console.log("error during save item"+error);
      
  //   })
  //   console.log("abc 2");
    
  //   return this.http.put<Item>(`${updateEndPoint}`,itemFromDB);

  // }

  
  submitItem(item: Item):Observable<Item> {

    console.log("inside method 1 : Item added" +item);
    console.log(item.itemName);
    
    
    return this.http.post<Item>(`${this.submitItemEndPoint}`,item);
    
  }

  UpdateRestaurantWithItem(itemid:string,restaurantId:string):Observable<Item>{
      console.log("inside the method :"+itemid);
      let updateEndPoint='';
      let itemFromDB:Item=new Item(0,'','',0,'');
      updateEndPoint =this.baseURL+'/items/'+itemid+'/restaurant/'+restaurantId; 
      return this.http.put<Item>(`${updateEndPoint}`,itemFromDB);
  
    }

  getAllItems():Observable<ItemDTO[]>{
    console.log("inside get method 1 : Restauarant "+this.getAllItemsEndPoint);
    return this.http.get<ItemDTO[]>(`${this. getAllItemsEndPoint}`);

  }

}
