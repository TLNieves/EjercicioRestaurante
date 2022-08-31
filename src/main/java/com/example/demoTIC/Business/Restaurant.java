package com.example.demoTIC.Business;

import javax.persistence.*;

@Entity
@Table
public class Restaurant {
    @Id
    @SequenceGenerator(
            name = "restaurant_sequence",
            sequenceName = "restaurant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "restaurant_sequence"
    )
    private Long id;
    private String nombre;
    private String telefono;
    private String dir;

    public Restaurant(Long id, String nombre, String telefono, String dir) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dir = dir;
    }

    public Restaurant(String nombre, String telefono, String dir) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dir = dir;
    }

    public Restaurant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", dir='" + dir + '\'' +
                '}';
    }
}
