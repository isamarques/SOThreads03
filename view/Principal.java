package view;
import controller.ThreadSoma;

public class Principal {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][5]; 
		
		for (int idThread = 0; idThread < 3; idThread++) {
		ThreadSoma threadId = new ThreadSoma(matriz);
		threadId.start();
		}
	}
}

