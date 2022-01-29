package dios.java.com;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int num, i, rest =0, cont =0, cont1=0;
        for(i=1; i <=10; i++) {
            System.out.print("Informe um número: ");
            num = scan.nextInt();
            rest = num % 2;
            if (rest == 0) {
                cont++;
            }else{
                cont1++;
            }
        }
        System.out.println("Quantidades de números pares: " + cont);
        System.out.println("Quantidades de números impares: " + cont1);
    }
}
