/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author PC
 */
public class Director {
    private String name;
    private int edad;

    public Director() {
    }

    public Director(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


@Override
public String toString(){
return "Director{" + "name=" + name + " , edad=" + edad + "}";

}

public void Dirije(){

    System.out.println(this.name + "dirije esta maravillosa película");

}
}