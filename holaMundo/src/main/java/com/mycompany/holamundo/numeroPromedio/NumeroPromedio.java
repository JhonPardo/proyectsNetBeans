
package com.mycompany.holamundo.numeroPromedio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumeroPromedio {
    
    public static void main(String[] args) throws IOException {
         
        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero: ");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero: ");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3 ;
        Double promedio = Double.valueOf(sumatoria/3);
        System.out.println("el numero Promedio es : " + promedio); 
        }
    
        private static Integer cargarNumero() throws IOException{
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(capturarTeclado);
            String strNumero = buffer.readLine();
            Integer numero = Integer.parseInt(strNumero); 
            return numero;
        }
    
}
