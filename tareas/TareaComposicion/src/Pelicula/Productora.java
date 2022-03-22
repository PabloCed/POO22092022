/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author PC
 */
public class Productora {
    
private String Nombre;
private String pais;

    public Productora() {
    }

    public Productora(String Nombre, String pais) {
        this.Nombre = Nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


@Override
public String toString(){
return "Productora{" + "Nombre=" + Nombre + " , pais=" + pais + "}";

}
public void Produjo(){

    System.out.println("La casa porductora" + this.Nombre + "produjo grandes exitos");



}

}
