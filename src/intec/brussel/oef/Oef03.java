package intec.brussel.oef;

import java.util.Scanner;

public class Oef03 {
    public static void main(String[] args) {


//        Schrijf een programma dat vraagt dat de gebruiker getallen één voor één in te voeren,
//        waarbij elk getal wordtopgeteld bij een sum totaal.
//        Het programma verlaat de loop wanneer de gebruiker -1 invoert en
//        druktvervolgens de sum van alle ingevoerde getallen af  (behalve -1)


        int number=0;
        int sum = 0;
        //loop
        do {
            //message
            System.out.println("Welcome, enter a number");
            //input
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            if (number != -1)
                sum += number;
            //exit
        } while (number != -1);

        //output(sum)
        System.out.println("total sum" + sum);

        //Mesage
        System.out.println("Goodbye!");

    }
}
