/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Controller;

import com.codeteam.CrudCode.Model.Entidad;
import com.codeteam.CrudCode.Service.EntidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author USUARIO
 */
@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")

public class EntidadController {
    @Autowired
    private EntidadService entidadService;
    
    //listar
    @GetMapping("/entidades")
    public List<Entidad> listar()
    {
        return entidadService.findAll();
    }
    
    //guardar
    @PostMapping("/entidades")
    public  Entidad guardar(@RequestBody Entidad entidad)
    {
        return entidadService.save(entidad);
    }
    
    //get una tarea
    @GetMapping("/entidades/{id_entidad}")
    public Entidad getUnaEntidad(@PathVariable Integer id_entidad)
    {
        return entidadService.findById(id_entidad);
    }
    
    //Modeficar
    @PutMapping("/entidades/{id_entidad}")
    public Entidad modifecar(@RequestBody Entidad entidad,@PathVariable Integer id_entidad)
    {
        Entidad entidadActual= entidadService.findById(id_entidad);
        entidadActual.setId_tipo_documento(entidad.getId_tipo_documento());
        entidadActual.setNro_documento(entidad.getNro_documento());
        entidadActual.setRazon_social(entidad.getRazon_social());
        entidadActual.setNombre_comercial(entidad.getNombre_comercial());
        entidadActual.setId_tipo_contribuyente(entidad.getId_tipo_contribuyente());
        entidadActual.setDireccion(entidad.getDireccion());
        entidadActual.setTelefono(entidad.getTelefono());
        entidadActual.setEstado(entidad.getEstado());
      
        return entidadService.save(entidadActual);
    }
    
    @DeleteMapping("/entidades/{id_entidad}")
    public void eliminar(@PathVariable Integer id_entidad)
    {
        entidadService.delete(id_entidad);
    }
}
