import { Component } from '@angular/core';
import { TipodocumentoService } from 'src/app/SERVICE/tipodocumento.service';

@Component({
  selector: 'app-tipodocumentos',
  templateUrl: './tipodocumentos.component.html',
  styleUrls: ['./tipodocumentos.component.css']
})
export class TipodocumentosComponent {
  listadocumentos:any=[];
  constructor(private documentoService: TipodocumentoService) { }

  ngOnInit(): void {
    this.listardocumentos();
  }

  listardocumentos()
  {
    this.documentoService.getDocumentos().subscribe(
      res=>{
        this.listadocumentos=res;
        console.log(res);
      },
      err=>console.log(err)
    );

  }

  eliminar(id:string)
  {
    this.documentoService.deleteDocumento(id).subscribe(
      res=>{this.ngOnInit();},
      err=>console.log(err)
    );
  }
}
