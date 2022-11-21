import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DocumentoService {
    url='http://localhost:8080/api/contribuyentes';
    constructor(private http: HttpClient) { }
  
    getContribuyentes():Observable<any>
    {
      return this.http.get(this.url);
    }
  
    getUnContribuyente(id: string):Observable<any>
    {
      return this.http.get(this.url+'/'+id);
    }
  
    saveContribuyente(contribuyente: Contribuyente):Observable<any>
    {
      return this.http.post(this.url, contribuyente);
    }
  
    editContribuyente(id:string, contribuyente: Contribuyente):Observable<any>
    {
      return this.http.put(this.url+'/'+id, contribuyente);
    }
  
    deleteContribuyente(id:string):Observable<any>
    {
      return this.http.delete(this.url+'/'+id);
    }
  }
  
  export interface Contribuyente{
    id_tipo_contribuyente:string;
    nombre:string;
    estado:string;
  }