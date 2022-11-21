/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeteam.CrudCode.Dao;
import com.codeteam.CrudCode.Model.Documento;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author USUARIO
 */
public interface DocumentoDao extends CrudRepository<Documento, Integer> {
    
}
