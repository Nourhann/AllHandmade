import { Component, OnInit } from '@angular/core';
import { Http } from "@angular/http";

@Component({
  selector: 'app-modify-item',
  templateUrl: './modify-item.component.html',
  styleUrls: ['./modify-item.component.css']
})
export class ModifyItemComponent implements OnInit {
  private items:any;
  constructor(http:Http) {

     http.get('http://localhost:8080/items/').subscribe(response => {
      this.items=response.json();
      console.log(response.json());
    });

  }

  ngOnInit() {
  }

}
