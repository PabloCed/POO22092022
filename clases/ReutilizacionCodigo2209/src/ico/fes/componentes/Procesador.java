/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author PC
 */
public class Procesador {

    private String marca;
    private float frecuenciaGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frecuenciaGhz) {
        this.marca = marca;
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public float getFrecuenciaGhz() {
        return frecuenciaGhz;
    }

    public void setFrecuenciaGhz(float frecuenciaGhz) {
        this.frecuenciaGhz = frecuenciaGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
@Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaEnGhz=" + frecuenciaGhz + '}';
    }
}
