import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './COMPONENTES/agregar/agregar.component';
import { DocumentosComponent } from './COMPONENTES/documentos/documentos.component';
import { EditarComponent } from './COMPONENTES/editar/editar.component';
import { InicioComponent } from './COMPONENTES/inicio/inicio.component';
import { TipodocumentosComponent } from './COMPONENTES/tipodocumentos/tipodocumentos.component';

const routes: Routes = [
  {path:'', redirectTo:'inicio', pathMatch:'full'},

  {path:'inicio', component:InicioComponent},
  {path:'documentos', component:DocumentosComponent},
  {path:'tiposdocumentos', component:TipodocumentosComponent},
  {path:'editar/:id', component: EditarComponent},
  {path:'agregar', component:AgregarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
