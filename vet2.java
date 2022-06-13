package vetandmtz;

public class mtzexi {

	public static void main(String[] args) {
		// Iniciando um Array
		int[] salas = { 35, 4, 22, 20, 36, 30 }; 
		// Declaração de variaveis
		int media = 0, mediafinal; 
		// Iniciando um Loop For primário
		
		for (int i = 0; i < salas.length; i++) { 
			// Imprimindo mensagem										
			System.out.println("Sala " + (i + 1) + " - " + salas[i]); 

		}
		// imprimindo mensagem
		System.out.println(" "); 
		// Iniciando um Loop For secundário
		for (int i = 0; i < salas.length; i++) { 
													
			media += salas[i]; // Somatória da quantidade de aluno por sala
		}
		// dividindo o total de alunos pelo total de salas para a obtenção da media
		mediafinal = media / salas.length; 
		
		// imprimindo mensagem
		System.out.println("Media de alunos por sala: " + media / salas.length); 
		 // imprimindo mensagem
		System.out.println(" ");
		// imprimindo mensagem
		System.out.println("Salas acima da media: "); 
		
		// Iniciando um Loop For terciário
		for (int i = 0; i < salas.length; i++) { 
			// Utilizando a estrutura IF para ver se cada sala é maior que a media	
			
			if (salas[i] > mediafinal) { 
				// imprimindo mensagem final						
				System.out.println("Sala " + (i + 1) + " - " + salas[i] + " alunos"); 
			}
		}

	}

}