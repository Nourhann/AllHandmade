import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http';
import {RouterModule} from '@angular/router';
import {SuiModule} from 'ng2-semantic-ui';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CardComponent } from './card/card.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { AddItemComponent } from './add-item/add-item.component';
import { HttpClientModule } from "@angular/common/http";
import { ModifyItemComponent } from './modify-item/modify-item.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CardComponent,
    HomeComponent,
    NavBarComponent,
    AddItemComponent,
    ModifyItemComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
       path : 'home',
       component : HomeComponent
      },
       {
       path : 'login',
       component : LoginComponent
      },
       {
       path : 'additem',
       component : AddItemComponent
      },
        {
       path : 'card/:name/:description/:price/:url',
       component : CardComponent
      },
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
