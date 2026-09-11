/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_juansuazo;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Videjuego {

    private int codigo;
    private String videojuego;
    private String plataforma;
    private float precio;
    private int stock;
    static Scanner entrada = new Scanner(System.in);

    public Videjuego(int codigo, String videojuegeo, String plataforma, float precio, int stock) {
        this.codigo = codigo;
        this.videojuego = videojuego;
        this.plataforma = plataforma;
        this.precio = precio;
        this.stock = stock;
    }

    public int codigo() {
        return codigo;

    }

    public String videojuego() {
        return videojuego;

    }

    public String plataforma() {
        return plataforma;

    }

    public float precio() {
        return precio;

    }

    public int Stock() {
        return stock;
    }

   

}
