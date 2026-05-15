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
    
    //saben como hacer que un pan hable?, lo meten al agua y al dia siguiente ya esta-blando
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
                    int maxcar = 0;
                    String mayus = "";
                    int num = 0;
                    int caracter = 0;
                                            
                    boolean analizador = false;
                    while (analizador==false) {   
                        char resp = 's';
                        while (resp=='s'){
                          entry.nextLine();
                          System.out.println("Ingrese su contrasena");
                          String contra=entry.nextLine();

                        while (contra.length()==0){
                           
                            System.out.println("Error...La entrada no puede estar vacia");
                            contra=entry.nextLine();
                            
                        }
                        int cantidad=0;
                        int contmayus=0;
                        int carespecial=0;
                        int cantnum=0;
                        if (contra.length()>8){
                            cantidad=1;
                            
                        }
                        
                        for (int i = 0 ;i<contra.length();i++){
                            char requisitos = contra.charAt(i);
                            if(requisitos>='A'&& requisitos<='Z'){
                                contmayus=1;
                            }
                             if(requisitos>='0'&&requisitos<='9'){
                                cantnum=1;
                            }
                            if(requisitos =='!'||requisitos =='@'|| requisitos =='#'||requisitos =='$' || requisitos =='%' || requisitos =='^' || requisitos =='&' || requisitos =='*'){        
                                carespecial=1;
                            } 
                        }
                        if (num==1&&contmayus==1&&cantidad==1&&carespecial==1){
                            System.out.println("contrasena segura");
                        }else {
                            
                        System.out.println("Contrasena insegura, fallo en  :");
                        if (cantidad==0){
                            System.out.println("-Minimo 8 caracteres");
                        }if (contmayus==0){
                            System.out.println("-Falta una mayuscula");
                        }if (cantnum==0){
                            System.out.println("-Falta un numero");
                        }if (carespecial==0){
                            System.out.println("-Falta un caracterer especial");
                            }
                        }
                            
                        System.out.println("Desea analizar otra contraseña? (S/N) :");
                        resp = entry.next().charAt(0);
                    
                    break;
       
                        }//while
                        
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
