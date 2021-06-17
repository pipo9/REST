import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {
  
  public host:string = "http://localhost:8090"

  constructor(private http:HttpClient) { }

  public getResource(url){
    return this.http.get(this.host+url);
  }
}
