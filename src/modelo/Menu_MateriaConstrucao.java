/** *
 * @author Clebson Leitao
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu_MateriaConstrucao {
static Integer valorMenu = 0;
static Scanner entrada = new Scanner(System.in);
static List<Material_construcao> produtos = new ArrayList();
			
	public static void main(String[] args) {
	while (valorMenu != 3) {
	if (valorMenu == 1) {
	informarPrecos();
	chamarMenu();
	} else if (valorMenu == 2) {
	imprimir();
	chamarMenu();
	} else if (valorMenu == 3) {
	System.exit(0);
	} else {
				chamarMenu();
			}
		}
	}

	private static void imprimir() {
            produtos.forEach((produto) -> {
                System.out.println(produto);
            });
		
	}

	private static void informarPrecos() {
		System.out.println("\nInforma o nome do Produto");
		String name = entrada.next();
		System.out.println("Quantidade de Produto");
		Integer quantidade = entrada.nextInt();
		System.out.println("Valor do Produto");
		Float valor = entrada.nextFloat();
		
	Material_construcao outroProduto = new Material_construcao(name, quantidade, valor);
		produtos.add(outroProduto);
	}

	private static void chamarMenu() {
	
	System.out.println("MENU");
	System.out.println("1:CADASTRAR PRODUTO");
	System.out.println("2:IMPRIMIR");
	System.out.println("3:SAIR");
		
	valorMenu = entrada.nextInt();
	
	}

  
    }