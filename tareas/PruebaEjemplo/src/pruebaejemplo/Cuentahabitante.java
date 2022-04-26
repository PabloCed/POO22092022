/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author PC
 */
public class Cuentahabitante {
private String idCliente;
private String nombre;
private int balance;

    public Cuentahabitante() {
    }

    public Cuentahabitante(String idCliente, String nombre, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



@Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }


     public void retirarDinero( float retiro ){
  System.out.println("cantidad del monto actual" + this.balance);
this.balance -= retiro;
    System.out.println("cantidad del monto restante" + this.balance);
       
}

 public String evaluarNivelCliente(){
     return this.balance > 50000?"Cliente premium":"Cliente regular";
}


}
