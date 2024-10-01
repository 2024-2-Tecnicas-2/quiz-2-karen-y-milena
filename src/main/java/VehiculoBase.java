/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class VehiculoBase {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;
 
    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }
 
    public void acelerar() {
        velocidadActual += 10;
        System.out.println(marca + " " + modelo + " aceleró. Velocidad actual: " + velocidadActual + " km/h.");
    }
 
    public void frenar() {
        velocidadActual = Math.max(velocidadActual - 10, 0); // Evita que la velocidad sea negativa
        System.out.println(marca + " " + modelo + " frenó. Velocidad actual: " + velocidadActual + " km/h.");
    }
}   

