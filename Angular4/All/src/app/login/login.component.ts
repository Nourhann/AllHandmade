import { Component, OnInit } from '@angular/core';
import { Http } from "@angular/http";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:String;
  password:String;
  constructor() { }

  ngOnInit() {
  }
Login(e,http:Http){
    
     this.username = e.target.elements[0].value;
     this.password = e.target.elements[1].value;
    console.log(this.username,this.username);

  }
}
