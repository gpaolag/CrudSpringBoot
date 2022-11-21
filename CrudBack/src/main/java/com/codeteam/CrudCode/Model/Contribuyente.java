/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeteam.CrudCode.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="Tb_Tipo_Contribuyente")
public class Contribuyente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_tipo_contribuyente")
    private Integer id_tipo_contribuyente;
    
    public Integer getId_tipo_contribuyente() {
        return id_tipo_contribuyente;
    }

    public void setId_tipo_contribuyente(Integer id_tipo_contribuyente) {
        this.id_tipo_contribuyente = id_tipo_contribuyente;
    }
    
    @Column(name="nombre")
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="estado")
    private Integer estado;
    
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
}
