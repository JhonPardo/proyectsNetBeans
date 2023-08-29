
package com.mycompany.holamundo.numeroPromedio.VerificacionNumeroParOImpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificacionNumeroParNumeroImpar {
    public static void main(String[] args) throws IOException {
         
        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = cargarNumero();
        
        Boolean esPar = (numero1 % 2) == 0;
        
        if(esPar){
            System.out.println("El numero es par ");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
        private static Integer cargarNumero() throws IOException {
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(capturarTeclado);
            String strNumero = buffer.readLine();
            Integer numero = Integer.valueOf(strNumero); 
            return numero;
        }
        
}
