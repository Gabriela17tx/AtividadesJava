package br.com.javaHerancaExercicio;

import java.util.Scanner;

public class Exercicio3 {
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

*/
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	Scanner entrada = new Scanner(System.in);

    double[][] n1 = new double[4][6];
    double[][] n2 = new double[4][6];
    double[][] m1 = new double[4][6];
    double[][] m2 = new double[4][6];


    System.out.println("Insira os valores para N1: ");
    for (int l = 0; l < n1.length; l++) {

    for (int c = 0; c < n1[l].length; c++) {

    n1[l][c] = ler.nextDouble();
        }

        }

    System.out.println("Insira os valores para N2: ");
    for (int l = 0; l < n2.length; l++) {

    for (int c = 0; c < n2[l].length; c++) {
            // n1[l][c]= Math.round(Math.random());
    n2[l][c] = ler.nextDouble();

    m1[l][c] = n1[l][c] + n2[l][c];

    m2[l][c] = n1[l][c] - n2[l][c];
        }

        }

    System.out.println("M1 = N1+N2:");
    for (int l = 0; l < m1.length; l++) {

    for (int c = 0; c < m1[l].length; c++) {
    System.out.print(m1[l][c] + "  ");
        }
    System.out.println();
        }

    System.out.println("M2 = N1-N2:");
    for (int l = 0; l < m2.length; l++) {

    for (int c = 0; c < m2[l].length; c++) {
    System.out.print(m2[l][c] + "  ");
        }
    System.out.println();

        }
   	
	ler.close();
	

	}

}
