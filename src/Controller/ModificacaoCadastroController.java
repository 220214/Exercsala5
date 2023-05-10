package Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;

public class ModificacaoCadastroController {
	private static final String CAMINHO_ARQUIVO = "C:\\TEMP\\cadastro.csv.csv";
	
	public ModificacaoCadastroController() {
		// TODO Auto-generated constructor stub
	}
	 private List<Cliente> lerClientesDoArquivo() throws IOException {
	        List<Cliente> clientes = new ArrayList<>();
	        Scanner scanner = new Scanner(new File(CAMINHO_ARQUIVO));
	        while (scanner.hasNextLine()) {
	            String linha = scanner.nextLine();
	            String[] campos = linha.split(";");
	            String cpf = campos[0];
	            String nome = campos[1];
	            int idade = Integer.parseInt(campos[2]);
	            Double limiteCredito = Double.parseDouble(campos[3].replace(",", "."));
	            clientes.add(new Cliente(cpf, nome, idade, limiteCredito));
	        }
	        scanner.close();
	        return clientes;
	    }
	 private void escreverClientesEmNovoArquivo(List<Cliente> clientes, String nomeArquivo) throws IOException {
	        FileWriter writer = new FileWriter(new File("C:\\TEMP\\" + nomeArquivo));
	        StringBuffer buffer = new StringBuffer();
	        int contador = 0;
	        for (Cliente cliente : clientes) {
	            String linha = cliente.getcpf() + ";" + cliente.getnome() + ";" + cliente.getidade() + ";" + cliente.getLcredito() + "\n";
	            buffer.append(linha);
	            contador++;
	        }
	        writer.write(buffer.toString());
	        writer.close();
	    }

	    public void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) throws IOException {
	        List<Cliente> clientes = lerClientesDoArquivo();
	        List<Cliente> clientesFiltrados = new ArrayList<>();
	        for (Cliente cliente : clientes) {
	            if (cliente.getidade() >= idadeMin && cliente.getidade() <= idadeMax && cliente.getLcredito() >= limiteCredito) {
	                clientesFiltrados.add(cliente);
	            }
	        }
	        escreverClientesEmNovoArquivo(clientesFiltrados, "Idade " + idadeMin + "-" + idadeMax + " limite " + limiteCredito + ".csv");
	    }
	}

