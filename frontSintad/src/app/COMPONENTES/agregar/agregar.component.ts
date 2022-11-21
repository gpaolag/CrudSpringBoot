import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DocumentoService } from 'src/app/SERVICE/documento.service';
import { Entidad, EntidadService } from 'src/app/SERVICE/entidad.service';
import { TipodocumentoService } from 'src/app/SERVICE/tipodocumento.service';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  listacontribuyentes:any[]=[];
  listadocumentos:any[]=[];
  entidadNueva: Entidad={
    id_entidad: '', id_tipo_documento: '', nro_documento: '',
    razon_social: '',
    nombre_comercial: '',
    id_tipo_contribuyente: '',
    direccion: '',
    telefono: '',
    estado: ''
  };

  constructor(private entidadService: EntidadService, 
    private antivateRouter: ActivatedRoute,
    private router:Router,
    private contribuyenteService: DocumentoService,
    private documentoService: TipodocumentoService
    ) { }

  ngOnInit(): void {
    this.listarContribuyentes();

  }

  listarContribuyentes()
      {
        this.contribuyenteService.getContribuyentes().subscribe(
          res=>{
            for (let valor of res){
              this.listacontribuyentes.push({id:valor.id_tipo_contribuyente , nombre:valor.nombre});
            }
          },
          err=>console.log(err)
        );
        this.documentoService.getDocumentos().subscribe(
          res=>{
            for (let valor of res){
              this.listadocumentos.push({id:valor.id_tipo_documento , nombre:valor.nombre});
            }
          },
          err=>console.log(err)
        );
    
      }

  agregarEntidad(){
    this.entidadService.saveEntidad(this.entidadNueva).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    );
  }

}
