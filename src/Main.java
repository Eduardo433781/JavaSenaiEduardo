import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        Long num4 = 10L;

        //------------------------------------------
        String nome = "Eduardo";
        System.out.println("Meu nome é: " + nome);

        //------------------------------------------
        float num2 = 10.5f;
        double num3 = 10.5;

        char valor = 129;

        System.out.println(num + num4);
        System.out.println(num - num4);
        System.out.println(num * num4);
        System.out.println(num / num4);
        System.out.println(num % num4);

        //-------------------------------------------
        byte newNovo = 127;
        byte newNovo2 = -128;
        System.out.println(newNovo);
        System.out.println(newNovo2);

        //-------------------------------------------
        char status = 'M';
        char status1 = 'A';
        char status2 = 'R';
        System.out.println(status);
        System.out.println(status1);
        System.out.println(status2);

        //--------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três caracteres:");
        char char1 = scanner.next().charAt(0); // Lê o primeiro caractere
        char char2 = scanner.next().charAt(0); // Lê o segundo caractere
        char char3 = scanner.next().charAt(0); // Lê o terceiro caractere

        // Concatena e exibe os caracteres
        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3);
        scanner.close();

        







    }
}