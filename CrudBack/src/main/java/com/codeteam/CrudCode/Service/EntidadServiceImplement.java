/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Service;
import com.codeteam.CrudCode.Dao.EntidadDao;
import com.codeteam.CrudCode.Model.Entidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USUARIO
 */

@Service
public class EntidadServiceImplement implements EntidadService{
    @Autowired
    private EntidadDao entidadDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Entidad> findAll()
    {
        return (List<Entidad>) entidadDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Entidad save(Entidad entidad)
    {
        return entidadDao.save(entidad);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Entidad findById(Integer id_entidad)
    {
        return entidadDao.findById(id_entidad).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id_entidad)
    {
        entidadDao.deleteById(id_entidad);
    }
    
}
