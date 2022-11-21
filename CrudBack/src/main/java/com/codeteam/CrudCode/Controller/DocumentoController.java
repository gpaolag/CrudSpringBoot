/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Controller;

import com.codeteam.CrudCode.Model.Documento;
import com.codeteam.CrudCode.Service.DocumentoService;
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
public class DocumentoController {
    @Autowired
    private DocumentoService documentoService;
    
    //listar
    @GetMapping("/documentos")
    public List<Documento> listar()
    {
        return documentoService.findAll();
    }
    
    //guardar
    @PostMapping("/documentos")
    public  Documento guardar(@RequestBody Documento documento)
    {
        return documentoService.save(documento);
    }
    
    //get una tarea
    @GetMapping("/documentos/{id_tipo_documento}")
    public Documento getUnDocumento(@PathVariable Integer id_tipo_documento)
    {
        return documentoService.findById(id_tipo_documento);
    }
    
    //Modeficar
    @PutMapping("/documentos/{id_tipo_documento}")
    public Documento modifecar(@RequestBody Documento documento,@PathVariable Integer id_tipo_documento)
    {
        Documento documentoActual= documentoService.findById(id_tipo_documento);
        documentoActual.setCodigo(documento.getCodigo());
        documentoActual.setNombre(documento.getNombre());
      
        return documentoService.save(documentoActual);
    }
    
    @DeleteMapping("/contribuyentes/{id_tipo_documento}")
    public void eliminar(@PathVariable Integer id_tipo_documento)
    {
       documentoService.delete(id_tipo_documento);
    }
}
