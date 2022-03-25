
package af.aula4;

public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;
    String placa;
    
    void acelerar(int aceleracao){
        
        vel += aceleracao;
 }
    void buzinar(){
        
    System.out.println("Buzina");
    
    }
    
    void placa(){
        
       System.out.println(nome);
       System.out.println(marca);        
       System.out.println(ano); 
       System.out.println(placa);
       
        }
    }

