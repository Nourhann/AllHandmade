import { Component, OnInit } from '@angular/core';
import { Http } from "@angular/http";
import { environment } from "src/environments/environment";
import { Router } from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:String;
  password:String;
  invalid:Boolean;
  router:Router;
  private http:Http;
  constructor() { }

  ngOnInit() {
  }
Login(input){
     this.username = input.target.elements[0].value;
     this.password = input.target.elements[1].value;
    console.log(this.username,this.username);

  }
ChickAuthontication(){
  let body = {id: this.username , password:this.password};
  return this.http.post(environment.loginUrl,JSON.stringify(body)).map(responce=>{
    let result = responce.json();
    if(result){
      localStorage.setItem('id',result);
      this.router.navigate(['/']);
    }
    this.invalid=true;
   //console.log(responce.json());
  });
}
}
