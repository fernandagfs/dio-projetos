package javaBasico;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá Turma, sejam bem-vindos!");

        int ano = 2022;
        ano = 2023;
        final String BR = "Brasil";
        String primeiroNome = "Fernanda";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
        
        byte numero1 = 100;
        short  numero2=numero1;
        numero1 = (byte) numero2;
        System.out.println(numero1);


    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat( segundoNome );
    }
}
