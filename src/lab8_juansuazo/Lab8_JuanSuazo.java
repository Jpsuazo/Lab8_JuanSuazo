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
    static String[][] repisas = new String[3][4];

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
        if (Gamelof.size() >= 12) {
            System.out.println("No se puede agregar el juego a gamlof");
            return;

        } else {
            System.out.println("Codigo: ");
            int codigo = entrada.nextInt();
            boolean codigorepetido = false;
            for (int posicion = 0; posicion < Gamelof.size(); posicion++) {
                if (Gamelof.get(posicion).getCodigo() == codigo) {
                    codigorepetido = true;

                }
                if (codigorepetido == true) {

                    System.out.println("Ese codigo ya esta registrado.");

                } else {

                    entrada.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Plataforma: ");
                    String plataforma = entrada.nextLine();

                    System.out.print("Precio: ");
                    double precio = entrada.nextDouble();

                    System.out.print("Stock: ");
                    int stock = entrada.nextInt();

                    Videjuego videojuego = new Videjuego(
                            codigo,
                            nombre,
                            plataforma,
                            precio,
                            stock
                    );

                    Gamelof.add(videojuego);

                    colocarrepisas(nombre);

                    System.out.println("Videojuego registrado correctamente.");
                }
            }
        }
    }

    public static void colocarrepisas(String nombre) {

        boolean colocado = false;

        for (int fila = 0; fila < repisas.length; fila++) {

            for (int columna = 0; columna < repisas[fila].length; columna++) {

                if (repisas[fila][columna].equals("Libre") && colocado == false) {

                    repisas[fila][columna] = nombre;

                    colocado = true;
                }
            }
        }
    }
     public static void liberarEstante(String nombre) {

        for (int fila = 0; fila < repisas.length; fila++) {

            for (int columna = 0; columna < repisas[fila].length; columna++) {

                if (repisas[fila][columna].equals(nombre)) {

                    repisas[fila][columna] = "Libre";
                }
            }
        }
    }
     public static void mostrarEstantes() {

        System.out.println("===== Repisas =====");

        for (int fila = 0; fila < repisas.length; fila++) {

            for (int columna = 0; columna < repisas[fila].length; columna++) {

                System.out.print("[" + repisas[fila][columna] + "]");
            }

            System.out.println();
        }
    }
 public static void mostrarVideojuegos() {

        if (Gamelof.size() == 0) {

            System.out.println("No hay videojuegos registrados.");

        } else {

            System.out.println("===== VIDEOJUEGOS REGISTRADOS =====");

            for (int posicion = 0; posicion < Gamelof.size(); posicion++) {

                Videjuego videojuegoActual = Gamelof.get(posicion);

                System.out.println("Videojuego #" + (posicion + 1));
                System.out.println("Codigo: " + videojuegoActual.getCodigo());
                System.out.println("Nombre: " + videojuegoActual.getNombre());
                System.out.println("Plataforma: " + videojuegoActual.getPlataforma());
                System.out.println("Precio: " + videojuegoActual.getPrecio());
                System.out.println("Stock: " + videojuegoActual.getStock());
            }
        }
    }
 public static void buscarVideojuego() {

        System.out.print("Ingrese el codigo del videojuego: ");
        int codigo = entrada.nextInt();

        Videjuego videojuegoEncontrado = buscarPorCodigo(codigo);

        if (videojuegoEncontrado != null) {

            System.out.println("\n===== VIDEOJUEGO ENCONTRADO =====");
            System.out.println("Codigo: " + videojuegoEncontrado.getCodigo());
            System.out.println("Nombre: " + videojuegoEncontrado.getNombre());
            System.out.println("Plataforma: " + videojuegoEncontrado.getPlataforma());
            System.out.println("Precio: " + videojuegoEncontrado.getPrecio());
            System.out.println("Stock: " + videojuegoEncontrado.getStock());

        } else {

            System.out.println("No existe un videojuego con ese codigo.");
        }
    }
     public static Videjuego buscarPorCodigo(int codigo) {

        for (int posicion = 0; posicion < Gamelof.size(); posicion++) {

            Videjuego videojuegoActual = Gamelof.get(posicion);

            if (videojuegoActual.getCodigo() == codigo) {

                return videojuegoActual;
            }
        }

        return null;
    }
     

}
