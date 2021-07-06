package br.com.generation.exercicioslacorepeticao;

import java.util.Scanner;


// 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero, contadorPar = 0, contadorImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
			
		for(int n = 0; n< 10; n++) {
			
			System.out.println("Digite 10 números aleatórios:");
			numero = leia.nextInt();
			
			if (numero %2 == 0) {
				contadorPar++; 
			}
			
			else {
				contadorImpar++;
			}
			
		}
			System.out.println("A quantidade de números pares são: " + contadorPar);
			System.out.println("A quantidade de números ímpares são: " + contadorImpar);
			
				
			leia.close();
		}
	
	}

				
						
				

