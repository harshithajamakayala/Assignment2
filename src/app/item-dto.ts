export class ItemDTO {
    itemName:string;
	 category:string;
	 cost:number;
     imageName:string;

     constructor(
        itemName:string,
        category:string,
        cost:number,
        imageName:string
     )
     {
        this.itemName=itemName;
        this.category=category;
        this.cost=cost;
        this.imageName=imageName;
     }
}
