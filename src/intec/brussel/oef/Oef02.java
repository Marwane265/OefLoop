package intec.brussel.oef;


import java.util.Scanner;

public class Oef02 {
    public static void main(String[] args) {

//        Schrijf een programma dat de faculteit van een bepaald getal te vinden.
//        uitleg: De faculteit van een niet-negatief geheel getal n
//        is het product van alle positieve gehele getallenkleiner dan of gelijk aan n.
//        De faculteit van 4 (geschreven als 4!) is bijvoorbeeld 4 x 3 x 2 x 1 = 24.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Dit is een negatief getal en kan dus niet");
        } else {

            int fac = 1;
            for (int index = 1; index <= num; index++) {
                fac *= index;

            }
            System.out.println("Sum total: " + fac);
        }

    }
}
