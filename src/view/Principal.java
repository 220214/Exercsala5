package view;

import java.io.IOException;

import Controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {
		  ModificacaoCadastroController controller = new ModificacaoCadastroController();
	        try {
				controller.novoCadastro(41, 60, 8000.00);
				controller.novoCadastro(31, 40, 5000.00);
		        controller.novoCadastro(21, 30, 3000.00);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	}


