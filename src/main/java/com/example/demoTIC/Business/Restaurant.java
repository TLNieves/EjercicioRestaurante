package com.example.demoTIC.Business;

public class Restaurant {
    private Long id;
    private String nombre;
    private Long telefono;
    private String dir;

    public Restaurant(Long id, String nombre, Long telefono, String dir) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dir = dir;
    }

    public Restaurant(String nombre, Long telefono, String dir) {
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
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
