package controller;
import javax.swing.JOptionPane;

public class ThreadSoma extends Thread {
	
	public ThreadSoma(int[][] matriz) {

		int[] vet = new int[3];
		int soma = 0;

		for (int i = 0; i < 3; i++) {
		    System.out.println(" ");
		    for (int j = 0; j < 5; j++) {
		    	String valor = JOptionPane.showInputDialog("Informe o valor");
                int v = Integer.parseInt(valor);
                matriz[i][j] = v;
                System.out.print(v + " ");
		    }
		}
		
		for (int j = 0; j < 3; j++) {
			
            for (int i = 0; i < 5; i++) {
                soma = soma + matriz[0][j];
            }
            System.out.println(" ");
            System.out.println("A soma da linha " + (j + 1) +" é " + soma);
        }
    }

	@Override
	public void run() {
		super.run();
	}
}
