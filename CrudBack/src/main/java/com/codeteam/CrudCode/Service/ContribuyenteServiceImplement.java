/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Service;
import com.codeteam.CrudCode.Dao.ContribuyenteDao;
import com.codeteam.CrudCode.Model.Contribuyente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
public class ContribuyenteServiceImplement implements ContribuyenteService{
    
    @Autowired
    private ContribuyenteDao contribuyenteDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Contribuyente> findAll()
    {
        return (List<Contribuyente>) contribuyenteDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Contribuyente save(Contribuyente contribuyente)
    {
        return contribuyenteDao.save(contribuyente);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Contribuyente findById(Integer id_tipo_contribuyente)
    {
        return contribuyenteDao.findById(id_tipo_contribuyente).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id_tipo_contribuyente)
    {
        contribuyenteDao.deleteById(id_tipo_contribuyente);
    }
    
}
