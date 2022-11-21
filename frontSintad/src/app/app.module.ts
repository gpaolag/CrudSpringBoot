import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InicioComponent } from './COMPONENTES/inicio/inicio.component';
import { NavbarComponent } from './COMPONENTES/navbar/navbar.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { DocumentosComponent } from './COMPONENTES/documentos/documentos.component';
import { TipodocumentosComponent } from './COMPONENTES/tipodocumentos/tipodocumentos.component';
import { AgregarComponent } from './COMPONENTES/agregar/agregar.component';
import { EditarComponent } from './COMPONENTES/editar/editar.component';

@NgModule({
  declarations: [
    AppComponent,
    InicioComponent,
    NavbarComponent,
    DocumentosComponent,
    TipodocumentosComponent,
    AgregarComponent,
    EditarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
