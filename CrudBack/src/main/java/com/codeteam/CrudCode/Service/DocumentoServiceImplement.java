/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Dao.DocumentoDao;
import com.codeteam.CrudCode.Model.Documento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */

@Service
public class DocumentoServiceImplement implements DocumentoService{
    
    @Autowired
    private DocumentoDao documentoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Documento> findAll()
    {
        return (List<Documento>) documentoDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Documento save(Documento documento)
    {
        return documentoDao.save(documento);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Documento findById(Integer id_tipo_documento)
    {
        return documentoDao.findById(id_tipo_documento).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id_tipo_documento)
    {
        documentoDao.deleteById(id_tipo_documento);
    }
}
