/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
package vehiculo;

import tipocombustible.TipoCombustible;

public interface Vehiculo {
    void acelerar(); 
    void frenar();      
    TipoCombustible tipoCombustible(); 
}