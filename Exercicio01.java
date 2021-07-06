package br.com.generation.exercicioslacorepeticao;

//1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

	 
public class Exercicio01 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1000; i<= 1999; i++) { // o contador vai de 1000 a 1999
			if (i % 11 == 5) { // todo resultado dividido por 11 e for igual a 5 foi determinado
			System.out.println(i);
			Thread.sleep(1000);
				
			}
			
				
		}
		

	}

}
