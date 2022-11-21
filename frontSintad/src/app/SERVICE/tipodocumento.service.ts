import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TipodocumentoService {
  url='http://localhost:8080/api/documentos';
  constructor(private http: HttpClient) { }

  getDocumentos():Observable<any>
  {
    return this.http.get(this.url);
  }

  getUnDocumento(id: string):Observable<any>
  {
    return this.http.get(this.url+'/'+id);
  }

  saveDocumento(documento: Documento):Observable<any>
  {
    return this.http.post(this.url, documento);
  }

  editDocumento(id:string, documento: Documento):Observable<any>
  {
    return this.http.put(this.url+'/'+id, documento);
  }

  deleteDocumento(id:string):Observable<any>
  {
    return this.http.delete(this.url+'/'+id);
  }
}

export interface Documento{
  id_tipo_documento:string;
  codigo:string;
  nombre:string;
}
