package br.senai.sp.model;

import java.security.CodeSource;
import java.util.Scanner;

public class coleta {


   public String nome;
    public double altura;

   public int peso;

    Scanner teclado = new Scanner(System.in);

    public void RegistroUser(){
        System.out.println("--------------------------------------------");
        System.out.println("qual seu nome");
        nome = teclado.next();
        System.out.println("qual seu peso: ");
        peso = teclado.nextInt();
        System.out.println("qual sua altura: ");
        altura = teclado.nextDouble();
        System.out.println("--------------------------------------------");
    }

}
