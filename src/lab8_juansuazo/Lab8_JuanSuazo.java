/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_juansuazo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Lab8_JuanSuazo {

    static Scanner entrada = new Scanner(System.in);

    
    static ArrayList<Videjuego> Gamelof = new ArrayList<>();
    static String [][] repisas = new String[3][4];

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("====== Game Stop ======");
            System.out.println("1. Registrar Videojuego ");
            System.out.println("2. Mostrar Videojuegos ");
            System.out.println("3. Buscar videojuego ");
            System.out.println("4. Actualizar videojuego ");
            System.out.println("5. Eliminar videojuego ");
            System.out.println("6. MOstrar estantes ");
            System.out.println("6. Mostrar juegos con poco stock ");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Registrar  videojuego");

                    break;
                case 2:
                    System.out.println("Mostrar videojuegos");

                    break;
                case 3:
                    System.out.println("Buscar videojuego");

                    break;
                case 4:
                    System.out.println("Actualizar videojuego");

                    break;
                case 5:
                    System.out.println("Eliminar videojuego");

                    break;
                case 6:
                    System.out.println("Mostrar estantes");

                    break;
                case 7:
                    System.out.println("Mostrar juegos con poco stock");
            }
        } while (opcion != 0);

    }

    public static void register() {
        if (Gamelof.size()>=12) {
            System.out.println("No se puede agregar el juego a gamlof");
            return;
            
        }

    }
}
