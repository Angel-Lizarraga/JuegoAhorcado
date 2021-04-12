import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Jugador {
    private String palabra;
    private char letra;
    private char opcion;
    
    Scanner scan = new Scanner(System.in);
    public Jugador(){
        
    }
    public String ingresarPalabra(){
        System.out.println("Ingresar palabra: ");
        
        palabra = scan.nextLine();
        String palabraUpper = palabra.toUpperCase();
        
     return palabraUpper;   
    }
    public char ingresarLetra(){
        System.out.println("Ingresar caracter:");
        
        letra = scan.next().charAt(0);
        char letraUpper = Character.toUpperCase(letra);
        
        return letraUpper;
        
    }
    public char ingresarOpcion(){
        System.out.println("Quieres adivinar la palabra completa? Y/N");
        
        opcion = scan.next().charAt(0);
        char opcionUpper = Character.toUpperCase(opcion);
        return opcionUpper;
    }
}
