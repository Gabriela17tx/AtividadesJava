package br.com.generatio.AtividadeJava03;

import java.util.Scanner;

public class Exercicio03 {
 /*Solicitar a idade de várias pessoas e imprimir:
	Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
	 O programa termina quando idade for =-99. (WHILE)*/
	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int idade = 0, x = 1, idMaior50 = 0, idMenor21 = 0;
		
		while(idade < 99){
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade <= 21){
				idMenor21++;
				
				System.out.print( idMenor21 +" Pessoa(s) tem menos que 21 anos\n");
			}
			
			if(idade >50 && idade < 99){
				idMaior50++;
				
				System.out.print( idMaior50 +" Pessoa(s) tem mais que 50 anos\n");
			}
			
				
			}
		
		System.out.print("\n"+"\n"+"\n" + idMenor21 +" Pessoa(s) tem menos que 21 anos\n");
		System.out.print( idMaior50 +" Pessoa(s) tem mais que 50 anos\n");
		
		ler.close();
			

		}



	}