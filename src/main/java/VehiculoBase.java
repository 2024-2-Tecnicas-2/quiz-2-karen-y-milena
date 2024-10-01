/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
package vehiculo;

import tipocombustible.TipoCombustible;

public abstract class VehiculoBase implements Vehiculo {
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
    }

    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
    public abstract TipoCombustible tipoCombustible();
}

