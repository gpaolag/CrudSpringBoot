/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Contribuyente;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public interface ContribuyenteService {
    public List<Contribuyente> findAll();
    public Contribuyente save(Contribuyente contribuyente);
    public Contribuyente findById(Integer id_tipo_contribuyente);
    public void delete(Integer id_tipo_contribuyente);
    
}
