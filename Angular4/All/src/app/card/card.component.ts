import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";
import { Input } from "@angular/core";

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  @Input() name:any;
  @Input() discription:any;
  @Input() price:any;
  @Input() url:any;
  //private name:String;
  //private description:String;
  //private price:String;
  //private url:String;
  constructor(private route:ActivatedRoute) { }
  
  ngOnInit() {
   console.log(this.name);
   console.log(this.discription);
   console.log(this.price);
   console.log(this.url);
  }

}
