/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado2;

/**
 *
 * @author Marco
 */
public class Cancion {
    public String titulo;
    public int id;
    public String autor;
    public int anio;
    public double duracion;
    public Cancion(String titulo, int id, String autor, int anio, double duracion){
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.anio = anio;
        this.duracion = duracion; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
}
