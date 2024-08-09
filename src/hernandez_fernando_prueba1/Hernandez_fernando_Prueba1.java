/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_prueba1;

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fdhg0
 */
public class Hernandez_fernando_Prueba1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int cantidad1 = 0, cantidad2 = 0, cantidad3 = 0, cantidad4 = 0;
        while (true) {
            System.out.println("-------MENU-------");
            System.out.println("1-Palabra Alrevez");
            System.out.println("2-Numero perfecto");
            System.out.println("3-Primos");
            System.out.println("4-Votaciones");
            System.out.println("5-Salir");
            System.out.println("------------------");
            
            int opcion = lea.nextInt();

            if (opcion == 1) {
                cantidad1 += 1;

                String palabra;
                char letraReversa;
                System.out.println("");
                System.out.println("Ingrese una palabra para imprimirla alrevez: ");
                palabra = lea.next();

                for (int contador = palabra.length() - 1; contador > -1; contador--) {
                    letraReversa = palabra.charAt(contador);
                    System.out.print(letraReversa);
                }
                System.out.println("");
            }
            if (opcion == 2) {
                cantidad2 += 1;
                int numeroIngresado = 0;
                int Suma = 0;
                System.out.println("Favor ingrese el numero al que desea evaluar: ");
                numeroIngresado = lea.nextInt();
                for (int contador1 = 1; contador1 < numeroIngresado; contador1++) {
                    if (numeroIngresado % contador1 == 0) {
                        Suma = Suma + contador1;
                    }
                }
                if (Suma == numeroIngresado) {
                    System.out.println(numeroIngresado + " es perfecto");

                } else {
                    System.out.println(numeroIngresado + " no es perfecto");
                    System.out.println("");
                }
            }
            if (opcion == 3) {
                cantidad3 += 1;
                Random random = new Random();
                int numeroRandom = random.nextInt(100);
                System.out.println(numeroRandom);
                int suma2 = 0;
                for (int contador1 = 1; contador1 <= numeroRandom; contador1++) {
                    if (numeroRandom % contador1 == 0) {
                        suma2 += contador1;
                    }
                }
                if (suma2 == numeroRandom + 1) {
                    System.out.println("el numero es primo");
                    System.out.println("su divisores son 1 " + numeroRandom);
                } else {
                    System.out.println("el numero no es primo");
                }
                System.out.println("");
            }
            if (opcion == 4) {
                cantidad4 += 1;
                int votantes = 0;
                String azul;
                String rojo;
                String negro;
                String amarillo;
                String nulo;
                String voto;
                int porcentaje;
                int votosGanando = 0;
                int votosTotalAzul = 0, votosTotalRojo = 0, votosTotalAmarillo = 0, votosTotalNegro = 0, votosTotalNulo = 0;
                while (true) {
                    System.out.println("Ingrese la cantidad de votantes en su pais: ");
                    votantes = lea.nextInt();
                    for (int contador = 1; contador <= votantes; contador++) {
                        System.out.println("Escoja su voto: (AZUL/ROJO/NEGRO/AMARILLO)");
                        voto = lea.next().toLowerCase();
                        if (voto.equals("azul")) {
                            votosTotalAzul += 1;
                        } else if (voto.equals("rojo")) {
                            votosTotalRojo += 1;
                        } else if (voto.equals("negro")) {
                            votosTotalNegro += 1;
                        } else if (voto.equals("amarillo")) {
                            votosTotalAmarillo += 1;
                        } else {
                            votosTotalNulo += 1;
                        }
                    }

                    int porcentajeNulo = (votosTotalNulo * 100) / votantes;
                    if (porcentajeNulo >= 60) {
                        System.out.println("VOTACION FALLIDA");
                        break;
                    }
                    if (votosTotalAzul > votosGanando) {
                        votosGanando = votosTotalAzul;
                    }
                    if (votosTotalRojo > votosGanando) {
                        votosGanando = votosTotalRojo;
                    }
                    if (votosTotalAmarillo > votosGanando) {
                        votosGanando = votosTotalAmarillo;
                    }
                    if (votosTotalNegro > votosGanando) {
                        votosGanando = votosTotalNegro;
                    }
                    if (votosGanando == votosTotalAzul) {
                        System.out.println("PLANILLA GANADORA AZUL CON UN TOTAL DE VOTOS DE: " + votosGanando + "");
                        porcentaje = (votosTotalAzul * 100) / votantes;
                        System.out.println("CON UN PORCENTAJE DE: " + porcentaje + "%");
                    }
                    if (votosGanando == votosTotalRojo) {
                        System.out.println("PLANILLA GANADORA ROJO CON UN TOTAL DE VOTOS DE: " + votosGanando + "");
                        porcentaje = (votosTotalRojo * 100) / votantes;
                        System.out.println("CON UN PORCENTAJE DE: " + porcentaje + "%");
                    }
                    if (votosGanando == votosTotalAmarillo) {
                        System.out.println("PLANILLA GANADORA AMARILLO CON UN TOTAL DE VOTOS DE: " + votosGanando + "");
                        porcentaje = (votosTotalAmarillo * 100) / votantes;
                        System.out.println("CON UN PORCENTAJE DE: " + porcentaje + "%");
                    }
                    if (votosGanando == votosTotalNegro) {
                        System.out.println("PLANILLA GANADORA NEGRO CON UN TOTAL DE VOTOS DE: " + votosGanando + "");
                        porcentaje = (votosTotalNegro * 100) / votantes;
                        System.out.println("CON UN PORCENTAJE DE: " + porcentaje + "%");
                    }
                    break;
                }
            }
            if (opcion == 5) {
                System.out.println("numero 1 cantidad de veces ingresado: " + cantidad1 + "");
                System.out.println("numero 2 cantidad de veces ingresado: " + cantidad2 + "");
                System.out.println("numero 3 cantidad de veces ingresado: " + cantidad3 + "");
                System.out.println("numero 4 cantidad de veces ingresado: " + cantidad4 + "");
                break;
            }

        }
    }
}
