package br.com.generation.exercicioslacorepeticao;

import java.util.Scanner;


// 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero, contadorPar = 0, contadorImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
			
		for(int n = 0; n< 10; n++) {
			
			System.out.println("Digite 10 n�meros aleat�rios:");
			numero = leia.nextInt();
			
			if (numero %2 == 0) {
				contadorPar++; 
			}
			
			else {
				contadorImpar++;
			}
			
		}
			System.out.println("A quantidade de n�meros pares s�o: " + contadorPar);
			System.out.println("A quantidade de n�meros �mpares s�o: " + contadorImpar);
			
				
			leia.close();
		}
	
	}

				
						
				

