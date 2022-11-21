import { Component } from '@angular/core';
import { DocumentoService } from 'src/app/SERVICE/documento.service';

@Component({
  selector: 'app-documentos',
  templateUrl: './documentos.component.html',
  styleUrls: ['./documentos.component.css']
})
export class DocumentosComponent {
  listacontribuyentes:any=[];
  constructor(private contribuyenteService: DocumentoService) { }

  ngOnInit(): void {
    this.listarContribuyentes();
  }

  listarContribuyentes()
  {
    this.contribuyenteService.getContribuyentes().subscribe(
      res=>{
        this.listacontribuyentes=res;
        console.log(res);
      },
      err=>console.log(err)
    );

  }

  eliminar(id:string)
  {
    this.contribuyenteService.deleteContribuyente(id).subscribe(
      res=>{this.ngOnInit();},
      err=>console.log(err)
    );
  }

}
