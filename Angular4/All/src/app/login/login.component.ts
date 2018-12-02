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
  //let body = {id: this.username , password:this.password};
  //return this.http.post('http://localhost:8080/admins/login',JSON.stringify(body)).map(responce=>{
    //let result = responce.json();
    //if(result){
      //localStorage.setItem('id',result);
     // return true;
    //}
    ///return false;
  //console.log(responce.json());
 // });
}
}
