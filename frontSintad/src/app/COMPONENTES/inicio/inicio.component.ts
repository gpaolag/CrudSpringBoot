import { Component, OnInit } from '@angular/core';
import { EntidadService } from 'src/app/SERVICE/entidad.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  lista:any=[];
  constructor(private entidadService: EntidadService) { }

  ngOnInit(): void {
    this.listarEntidades();
  }

  listarEntidades()
  {
    this.entidadService.getEntidades().subscribe(
      res=>{
        this.lista=res;
        console.log(res);
      },
      err=>console.log(err)
    );

  }

  eliminar(id:string)
  {
    this.entidadService.deleteEntidad(id).subscribe(
      res=>{this.ngOnInit();},
      err=>console.log(err)
    );
  }

}
