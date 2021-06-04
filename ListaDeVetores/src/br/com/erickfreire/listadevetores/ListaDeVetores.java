package br.com.erickfreire.listadevetores;

import java.util.ArrayList;

/**
 * Programa em Java que cria uma lista de vetores
 * @author Erick Freire
 * @version 1 - Criado em 04-06-2021 as 15:07
 */

public class ListaDeVetores {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		
		itens.add("vermelho");
		itens.add(0, "amarelo");
		
		System.out.print("Mostra o conteúdo da lista com um laço de repetição:");
		
		for (int i = 0; i < itens.size(); i++)
			System.out.printf(" %s", itens.get(i));
		
		mostra(itens,"%nMostra o estado da lista contendo:");
		
		itens.add("verde");
		itens.add("amarelo");
		
		mostra(itens, "Mostra os novos elementos:");
		
		itens.remove("amarelo");
		mostra(itens, "Mostra o primeiro elemento amarelo sendo removido");
		
		itens.remove(1);
		mostra(itens, "Mostra o elemento verde sendo eliminado");
		
		System.out.printf("\"vermelho\" está na lista %n",itens.contains("vermelho") ? "": "Não ");
		
		System.out.printf("Tamanho: %s%n", itens.size());

	}
	
	public static void mostra(ArrayList<String> i, String cabecalho) {
		System.out.printf(cabecalho);
		
		for (String item : i)
			System.out.printf(" %s", item);
		
		System.out.println();
		
	}

}
