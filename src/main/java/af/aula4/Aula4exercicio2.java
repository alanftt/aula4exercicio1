
package af.aula4;

import java.util.Scanner;

/**
 *
 * @author univicosa
 */
public class Aula4exercicio2 {
    public static void main(String args[])
{
Scanner input = new Scanner(System.in);

float percentual;
float valordecusto;
double valorvendas;

System.out.println("Digite o preco do produto: ");
valordecusto = input.nextFloat();    

System.out.println("Digite a porcentagem que será adicionada de 0 a 100%: ");
percentual = input.nextFloat();

valorvendas = valordecusto +((valordecusto * percentual)/100);

System.out.println("O valor final de venda do produto é de: " +valorvendas);
}
}


