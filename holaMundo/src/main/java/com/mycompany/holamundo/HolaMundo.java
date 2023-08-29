
package com.mycompany.holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HolaMundo {
    
    public static void main(String[] args) throws IOException {
         
        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero: ");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero: ");
        Integer numero3 = cargarNumero();
        
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
        }
    
        private static Integer cargarNumero() throws IOException{
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(capturarTeclado);
            String strNumero = buffer.readLine();
            Integer numero = Integer.parseInt(strNumero); 
            return numero;
        }
        
        private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3){
            
        Integer mayor = numero1;
        
        if (numero2 > mayor){
            mayor = numero2; 
        }if(numero3 > mayor){
          mayor = numero3;
        } 
        System.out.println("el numero mayor es: " + mayor); 
        }
        
        private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3){
      
        Integer menor = numero1;
        if (numero2 < menor){
            menor = numero2; 
        }if(numero3 < menor){
          menor = numero3;
        } 
        System.out.println("el numero menor es: " + menor); 
        }
        
    }


