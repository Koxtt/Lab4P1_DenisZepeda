/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_deniszepeda;

import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class Lab4P1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entry = new Scanner (System.in);
        System.out.println("-----MENU-----");
        System.out.println("1) Analizador de constrasenas");
        System.out.println("2) Cascada y simetria");
        System.out.println("3) Cifrado Cesar");
        System.out.println("4) Salir");
        System.out.println("Ingrese una Opcion dentro del rango[1-4]");
        int opc = entry.nextInt();
        while (opc<1 || opc>4){ 
            System.out.println("Error... Ingreso una opcion fuera de Rango");
            System.out.println("-----MENU-----");
            System.out.println("1) Analizador de contrasenas");
            System.out.println("2) Cascada y simetria");
            System.out.println("3) Cifrado Cesar");
            System.out.println("4) Salir");
            System.out.println("Ingrese una Opcion dentro del rango[1-4]");
            opc = entry.nextInt();
        }
                switch (opc) {
                case 1:
                    System.out.println("Analizador de constrasenas");
                    char volver = 's';
                    int maxcar = 0;
                    String mayus = "";
                    int num = 0;
                    int caracter = 0;
                    while (volver=='s') {                        
                    boolean analizador = false;
                    while (analizador==false) {   
                        System.out.println("Ingrese su contrasena");
                        String contra = "";
                        contra = entry.next();
                        
                        if (contra.isEmpty()) {
                            System.out.print("Error...La entrada no puede estar vacia");
                            continue;                            
                        }
      
                        
                        }//while
                        System.out.println("Desea volver a ejecutar el codigo? (s/n)");
                        volver = entry.next().charAt(0);
                    }return;
                    

                    
                case 2:
                    System.out.println("Cascada y Simetria");
                    boolean cascadasysimetrias = false;
                    while (cascadasysimetrias==false) {                        
                        System.out.println("Ingrese una palabra (sin espacios)");
                        String word = "";
                        word = entry.next();
                        
                        String acum="";
                        int acumh = 1;
                        
                        if (word.isEmpty()) {
                            System.out.print("Error la entrada no puede ser vacia");
                            continue;
                        }
                        
                        for (int i = 0; i < word.length(); i++) {
                            acum+=word.charAt(i);
                            System.out.print(acum);
                            System.out.println("");
                        }
                        
                        for (int i = word.length()-1; i >0; i--) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(word.charAt(j));
                            }
                            System.out.println("");
                        }
                        cascadasysimetrias = true;
                    }
                    break;
                case 3:
                    System.out.println("Cifrado Cesar");
                    boolean palabrasCifradas = false;
                    while (palabrasCifradas==false) { 
                        entry.nextLine();
                        System.out.print("Introduzca una palabra/frase corta para cifrar: ");
                        String palabra = "";
                        palabra = entry.nextLine();
                        
                        if (palabra.isEmpty()) {
                            System.out.print("Error...La entrada no puede estar vacia");
                            continue;
                        }
                        
                        System.out.print("Ingrese un numero para el desplazamiento: ");
                        int desplaza = entry.nextInt();
                        
                        if (desplaza>=0) {     
                        String palabraCifrada = "";
                            for (int i = 0; i < palabra.length(); i++) {
                            char characterOriginal = palabra.charAt(i);

                            char caracterCifrado  = (char) (characterOriginal + desplaza);

                            palabraCifrada += caracterCifrado;
                        } //for
                        
                            
                        System.out.println("Palabra ingresada: "+palabra);
                        System.out.println("Cifrado: " +palabraCifrada);
                        break;
                        } else{ //if
                            System.out.println("Numero invalido... Ingrese un numero mayor o igual a cero");
                        }// else
                    }//while
                    palabrasCifradas=true;

                case 4:
                    System.out.println("Gracias por ejecutar el programa!");
                    break;
                
            }
            
    }
    
}
