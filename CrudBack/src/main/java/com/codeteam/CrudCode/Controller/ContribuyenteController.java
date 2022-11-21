/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Controller;

import com.codeteam.CrudCode.Model.Contribuyente;
import com.codeteam.CrudCode.Service.ContribuyenteService;
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
public class ContribuyenteController {
    @Autowired
    private ContribuyenteService contribuyenteService;
    
    //listar
    @GetMapping("/contribuyentes")
    public List<Contribuyente> listar()
    {
        return contribuyenteService.findAll();
    }
    
    //guardar
    @PostMapping("/contribuyentes")
    public  Contribuyente guardar(@RequestBody Contribuyente contribuyente)
    {
        return contribuyenteService.save(contribuyente);
    }
    
    //get una tarea
    @GetMapping("/contribuyentes/{id_tipo_contribuyente}")
    public Contribuyente getUnContribuyente(@PathVariable Integer id_tipo_contribuyente)
    {
        return contribuyenteService.findById(id_tipo_contribuyente);
    }
    
    //Modeficar
    @PutMapping("/contribuyentes/{id_tipo_contribuyente}")
    public Contribuyente modifecar(@RequestBody Contribuyente contribuyente,@PathVariable Integer id_tipo_contribuyente)
    {
        Contribuyente contribuyenteActual= contribuyenteService.findById(id_tipo_contribuyente);
        contribuyenteActual.setNombre(contribuyente.getNombre());
        contribuyenteActual.setEstado(contribuyente.getEstado());
      
        return contribuyenteService.save(contribuyenteActual);
    }
    
    @DeleteMapping("/contribuyentes/{id_tipo_contribuyente}")
    public void eliminar(@PathVariable Integer id_tipo_contribuyente)
    {
       contribuyenteService.delete(id_tipo_contribuyente);
    }
}
