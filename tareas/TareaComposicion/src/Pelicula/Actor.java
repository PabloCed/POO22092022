/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author PC
 */
public class Actor {
   private String Nombre;
private int premios;

    public Actor() {
    }

    public Actor(String Nombre, int premios) {
        this.Nombre = Nombre;
        this.premios = premios;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
 @Override
public String toString(){
return "Actor{" + "Nombre=" + Nombre + " , premios=" + premios + "}";

}

public void Actuo(){

    System.out.println(this.Nombre + "actuo en esta pelicula de manera grandiosa");

}
}
