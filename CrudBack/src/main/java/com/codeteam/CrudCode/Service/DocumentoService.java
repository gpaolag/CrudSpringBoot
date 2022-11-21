/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeteam.CrudCode.Service;
import com.codeteam.CrudCode.Model.Documento;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public interface DocumentoService {
    public List<Documento> findAll();
    public Documento save(Documento documento);
    public Documento findById(Integer id_tipo_documento);
    public void delete(Integer id_tipo_documento);
}
