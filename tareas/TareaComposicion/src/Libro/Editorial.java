/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author PC
 */
public class Editorial {
    private String titulo;
    private int numero;

    public Editorial() {
    }

    public Editorial(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

@Override
public String toString(){
return "Editorial{" + "titulo=" + titulo + " , numero=" + numero + "}";

}
public void Edita (){
    System.out.println("la editorial " + this.titulo + "Editan libros con mucho  renombre");
}


}
