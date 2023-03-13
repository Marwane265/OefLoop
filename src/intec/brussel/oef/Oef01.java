package intec.brussel.oef;

import java.util.Scanner;

public class Oef01 {
    public static void main(String[] args) {
//        Oefening 1 Schrijf een programma dat alle even nummers uitprint tot en met 10.
//        Oefening 1+ Zorg nu dat de even nummers worden opgeteld en print het totaal uit.

//        oef01:

        int sum = 0;
        for (int index = 0; index <= 10; index++) {

            if (index % 2 == 0) {
                sum += index;
                System.out.println(index);

            }

        }
        System.out.println("Sum total: " + sum);


    }


}
