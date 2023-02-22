import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item';
import { ItemOperationsService } from '../item-operations.service';

@Component({
  selector: 'app-item-view',
  templateUrl: './item-view.component.html',
  styleUrls: ['./item-view.component.css']
})
export class ItemViewComponent {
  __itemService:ItemOperationsService;
  router:Router;

  allItems:Array<Item>=[];
 


  constructor(itemService:ItemOperationsService,router:Router){
    this.__itemService=itemService;
    this.allItems=this.__itemService.getItemArr();
    this.router=router;
  }

}
