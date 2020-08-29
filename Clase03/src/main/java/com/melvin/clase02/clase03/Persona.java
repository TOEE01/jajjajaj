/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melvin.clase02.clase03;

/**
 *
 * @author recin
 */
public class Persona {
    protected String Nombre, Sexo, Direccion;
    protected int Edad, Peso, Altura;

    public Persona() {
        
        
    }

    public Persona (String Nombre, String Sexo, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;       
        this.Edad = Edad;
    }

   
    
    
    public Persona(String Nombre, String Sexo, String Direccion, int Edad, int Peso, int Altura) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        int Edad = this.Edad;
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

       String EsMAyorDeEdad() {
       int edad = this.Edad;
       if(edad < 18){
       return "Es Menor de Edad";
       }
       else {
           return "Es Mayor de Edad";
                   
       }
}   
    
        
    public String DastosPersonales() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Direccion=" + Direccion + ", Edad=" + Edad + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    
        
  
}

    
    public String SinPesoYAltura() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Edad=" + Edad + '}';
    }


}

