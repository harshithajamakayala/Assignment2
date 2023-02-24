import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ItemDTO } from '../item-dto';
import { ItemOperationsService } from '../item-operations.service';

@Component({
  selector: 'app-user-item-view',
  templateUrl: './user-item-view.component.html',
  styleUrls: ['./user-item-view.component.css']
})
export class UserItemViewComponent {
  __itemService: ItemOperationsService;
  router: Router;

  items: ItemDTO[] = [];
  constructor(itemService: ItemOperationsService, router: Router) {
    this.__itemService = itemService;
    this.router = router;
  }
  
  viewAllItems() {
    this.__itemService.getAllItems().subscribe(
      data => {
        console.log("data:-" + data);
        this.items = data;

      }, err => {
        console.log("error from spring", err);

      }
    )
  }


}
