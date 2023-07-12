package holamundo;

import java.util.Scanner;


public class Programa {

  
    public static void main(String[] args) {

      
      Consola c = new Consola();
      String nombre = c.leerString("ingrese su nombre ");
      System.out.println("su nombre es" + nombre);
      String domicilio = c.leerString("ingrese su domicilio");
      System.out.println("su domicilio es" + domicilio);
      String materia = c.leerString("en que materia se inscribe?");
      System.out.println("la materia es " + materia);
      float numero = c.leerfloat("ingrese un float");
      System.out.println("el float ingresado es " + numero);


    } 
}
