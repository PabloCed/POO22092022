/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author PC
 */
public class Alumno {

// puse cienta en vez de cuenta, una disculpa de antemano
private String numeroCienta;
private int semestre;
private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCienta, int semestre, float promedio) {
        this.numeroCienta = numeroCienta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCienta() {
        return numeroCienta;
    }

    public void setNumeroCienta(String numeroCienta) {
        this.numeroCienta = numeroCienta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

@Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCienta + ", semestre=" + semestre + ", promedio=" + promedio + '}';

    }

public void estudiar (int minutos){
    System.out.println("Estudiando..." + minutos + "minutos");


}



public String evaluarDesempenio(){
return this.promedio > 8.0f?"Sobresaliente":"Regular";
}

}


