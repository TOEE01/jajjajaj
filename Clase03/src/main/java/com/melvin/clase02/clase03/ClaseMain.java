/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melvin.clase02.clase03;

import java.util.Scanner;

/**
 *
 * @author recin
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Persona per = new Persona("Melvin", "M", "Las Mesas", 19, 45, 160);
//        System.out.println(per.Datos());
        //Pedimos datos al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu Nombre");
        String Nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + Nombre);

        System.out.println("Escribe tu direccion");
        String Direccion = sc.nextLine();
        System.out.println("Tu direccion es: " + Direccion);

        System.out.println("Escribe tu sexo");
        String Sexo = sc.nextLine();
        System.out.println("Tu sexo es: " + Sexo);

        System.out.println("Escribe tu edad");
        int Edad = sc.nextInt();
        System.out.println("Tu edad es: " + Edad);

        System.out.println("Escibe tu peso");
        int Peso = sc.nextInt();
        System.out.println("Tu peso es: " + Peso + "kg");

        System.out.println("Escribe tu altura");
        int Altura = sc.nextInt();
        System.out.println("Tu altura es: " + Altura + "cm");

        //Se crea el objeto Persona
        Persona ps = new Persona();
        ps.setNombre(Nombre);
        ps.setDireccion(Direccion);
        ps.setSexo(Sexo);
        ps.setEdad(Edad);
        ps.setPeso(Peso);
        ps.setAltura(Altura);

        Persona ps1 = new Persona(Nombre, Sexo, Direccion, Edad, Peso, Altura);

        Persona ps2 = new Persona (ps1.getNombre(), ps1.getSexo(), ps1.getEdad());
        
        System.out.println(ps.DastosPersonales());
        System.out.println(ps.EsMAyorDeEdad());
        
        System.out.println(ps1.DastosPersonales());
        System.out.println(ps1.EsMAyorDeEdad());
        
        System.out.println(ps2.SinPesoYAltura());
        System.out.println(ps2.EsMAyorDeEdad());

    }

}
