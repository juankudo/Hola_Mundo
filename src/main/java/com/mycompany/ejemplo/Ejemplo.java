/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class Ejemplo {



    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tú nombre: ");
        nombre = leer.next();
        System.out.println("Hello World! Soy " + nombre + " y estoy programando en Java");
    }
}
