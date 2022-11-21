import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EntidadService {

  url='http://localhost:8080/api/entidades';
  constructor(private http: HttpClient) { }

  getEntidades():Observable<any>
  {
    return this.http.get(this.url);
  }

  getUnaEntidad(id: string):Observable<any>
  {
    return this.http.get(this.url+'/'+id);
  }

  saveEntidad(entidad: Entidad):Observable<any>
  {
    return this.http.post(this.url, entidad);
  }

  editEntidad(id:string, entidad: Entidad):Observable<any>
  {
    return this.http.put(this.url+'/'+id, entidad);
  }

  deleteEntidad(id:string):Observable<any>
  {
    return this.http.delete(this.url+'/'+id);
  }
}

export interface Entidad{
  id_entidad:string;
  id_tipo_documento:string;
  nro_documento:string;
  razon_social:string;
  nombre_comercial:string;
  id_tipo_contribuyente:string;
  direccion:string;
  telefono:string;
  estado:string;
}