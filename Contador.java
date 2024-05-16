package edu.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numeroUm=scanner.nextInt();
        System.out.println("Digite o segundo número");
        int numeroDois=scanner.nextInt();
        try {
            contar(numeroUm,numeroDois);
        }catch (ParametrosInvalidosException e) {

            System.out.println("o Segundo número deve ser maior que o primeiro");
        }

    }
    static void contar(int numeroUm,int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm>numeroDois){
        throw new ParametrosInvalidosException("o segundo deve ser maior");
        }
        else{
            System.out.println("caiu no else");
        int contagem=numeroDois-numeroUm;
            System.out.println(contagem);
            for (int i=0;i<contagem;i++){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }

    }
}
