
package af.aula4;

public class CarroTestar {
    public static void main(String [] args){
        
        Carro c1 = new Carro();
        
        
        c1.nome = "Kadett";
        c1.marca = "Chevrolet";
        c1.ano = 1980;
        c1.vel = 60;    
        c1.placa = "teste";
        
        c1.acelerar(10);
        System.out.println(c1.vel);
        System.out.println(c1.placa);
        System.out.println(c1.ano);
        System.out.println(c1.marca);
        System.out.println(c1.nome);
        

    }
    
    
}
