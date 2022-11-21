/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Dao;

import com.codeteam.CrudCode.Model.Entidad;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */

public interface EntidadDao extends CrudRepository<Entidad, Integer>{
    
}