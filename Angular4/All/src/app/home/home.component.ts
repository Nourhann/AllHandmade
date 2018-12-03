import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { Http } from "@angular/http";
import { HttpClient } from '@angular/common/http';
import { environment } from "src/environments/environment";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  http:HttpClient;
  cards:any[];
  private router:Router;
  constructor(http:Http) 
  {
     http.get(environment.getItemUrl).subscribe(response => {
      this.cards=response.json();
      console.log(response.json());
    });

   }
  ngOnInit() {
    this.getData();
    //console.log(this.cards);
  }
  getData(){
 
  }

trackCard(index,card){
  return card? card.id :undefined;
}
}
