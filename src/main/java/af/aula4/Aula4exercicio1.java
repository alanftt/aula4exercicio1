import java.util.Scanner;        
package af.aula4;

public class Aula4exercicio1 {
    public static void main(String args[])
{
Scanner input = new Scanner(System.in);
double raio;
double PI = 3.14;
double area;

System.out.print("Digite o raio do circulo: " );
raio = input.nextDouble();

area = PI * (raio * raio);
System.out.print("A Area do circulo é: " +area );
}
    
}
