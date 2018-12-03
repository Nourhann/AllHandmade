import { Component, OnInit } from '@angular/core';
import { Http } from "@angular/http";
import { environment } from "src/environments/environment";

@Component({
  selector: 'app-modify-item',
  templateUrl: './modify-item.component.html',
  styleUrls: ['./modify-item.component.css']
})
export class ModifyItemComponent implements OnInit {
  private items:any[];
  constructor(private http:Http) {

     http.get(environment.getItemUrl).subscribe(response => {
      this.items=response.json();
      console.log(response.json());
    });

  }
  deleteitem(item){
    this.http.delete(environment.getItemUrl+item.id).subscribe(responce=>{
      let index = this.items.indexOf(item);
      this.items.splice(index,1);
    })
  }
  ngOnInit() {
  }

}
