/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author PC
 */
public class Teclado {

    private String marca;
    private int numeroTclas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroTclas) {
        this.marca = marca;
        this.numeroTclas = numeroTclas;
    }

    public int getNumeroTclas() {
        return numeroTclas;
    }

    public void setNumeroTclas(int numeroTclas) {
        this.numeroTclas = numeroTclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


 @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTclas + '}';
    }



}
