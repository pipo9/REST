import { Component, OnInit } from '@angular/core';
import { CatalogueService } from './catalogue.service';
import {Router} from '@angular/router'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'angularfrontend';
  categories;
  currentCategory;
  constructor(private catalogueService:CatalogueService, private router:Router){}
   
  ngOnInit():void{
    this.getCategories();
  }

  private getCategories(){
    
    this.catalogueService.getResource("/categories")
    .subscribe(data =>{
      this.categories=data;
    },error =>{
      console.log(error);
    })
  }
  getProductByCat(c){
    this.currentCategory = c;
    console.log(c);
    if(c.name==="Computers")
    this.router.navigateByUrl('/products/2/'+1);
    else if(c.name==="Printers")
    this.router.navigateByUrl('/products/2/'+2);
    else     
    this.router.navigateByUrl('/products/2/'+3);

  }
  onSelectedProducts(){
    this.currentCategory=undefined;
    this.router.navigateByUrl('/products/1/0');
  }

}
