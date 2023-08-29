
package ejerciciossiclos;

import java.io.IOException;

public class EjerciciosSiclos {

    public static void main(String[] args) throws IOException{
        String resultado = "";
        
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if(esPrimo(numero)){
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("los primeros 100 numeros primos son " + resultado);
    }
    
    private static Boolean esPrimo(Integer numero){
        Boolean esUnNumeroPrimo = true;
        
        for (int i =2; i< numero; i++) {
            
            if(numero % i == 0){
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
    
    
    
}


    
