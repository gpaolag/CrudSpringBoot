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
@Table(name="Tb_Entidad")
public class Entidad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_entidad")
    private Integer id_entidad;
    
    public Integer getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(Integer id_entidad) {
        this.id_entidad = id_entidad;
    }
    
    @Column(name="id_tipo_documento")
    private Integer id_tipo_documento;
    
    public Integer getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(Integer id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }
    
    @Column(name="nro_documento")
    private String nro_documento;
    
    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }
    
    @Column(name="razon_social")
    private String razon_social;
    
    @Column(name="nombre_comercial")
    private String nombre_comercial;
    
    @Column(name="id_tipo_contribuyente")
    private Integer id_tipo_contribuyente;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="telefono")
    private String telefono;
    
    @Column(name="estado")
    private Integer estado;

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public Integer getId_tipo_contribuyente() {
        return id_tipo_contribuyente;
    }

    public void setId_tipo_contribuyente(Integer id_tipo_contribuyente) {
        this.id_tipo_contribuyente = id_tipo_contribuyente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
    
}
