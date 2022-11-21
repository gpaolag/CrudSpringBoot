/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Entidad;
import java.util.List;

/**
 *
 * @author USUARIO
 */

public interface EntidadService {
    
    public List<Entidad> findAll();
    public Entidad save(Entidad entidad);
    public Entidad findById(Integer id_entidad);
    public void delete(Integer id_entidad);
}
