import java.util.Scanner;

public class elseIf{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int inserisciNumero;
    System.out.println("inserisci un numero");
    inserisciNumero= sc.nextInt();

    if (inserisciNumero<100) {
        System.out.println("il numero inserito è minore di 100");
    }else if (inserisciNumero<200) {
    System.out.println("il numero è minore di 200");
    }else {
    System.out.println("maggiore di 200");
    }
    sc.close();
}   
}