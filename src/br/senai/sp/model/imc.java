package br.senai.sp.model;

public class imc {
    public int peso;
    public double altura;

    public double imc;

    public void calcularImc(coleta user){

         imc = user.peso / (user.altura * user.altura);
         System.out.println(imc);

    }

    public void classificarimc(){
        if (imc < 18 ){
            System.out.println("muito frango");
        } else if (imc >= 18 && imc <= 24.9){
            System.out.println("Normal");
        } else if (imc >= 25.0 && imc  <= 29.9){
            System.out.println("sobrepeso");
        } else if (imc  >= 30.0 && imc <= 34.9){
            System.out.println("obeso grau 1");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("obeso grau 2");
        } if (imc  >= 40.0){
            System.out.println("Obeso grau 3 ou Morbido");
        }
    }
}
