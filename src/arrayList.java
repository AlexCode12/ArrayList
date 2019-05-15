/*
   Psuedokod:
   Fråga om användarens poäng
   Lägg in det i en ArrayList
   Sortera antalet
    */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int t = 0;
        System.out.println("How many objects should be sorted?");
        int h = sn.nextInt();
        do {
            System.out.println("\n Input next score");
            int Score = sn.nextInt();
            scores.add(Score);
            System.out.println("This is the current list: ");
            Collections.sort(scores, Collections.reverseOrder());
            for (int i : scores) {
                System.out.println(i);
            }
            t++;
        }while (t<h);
        /*
        Syftet med denna doWhile loop var att få till sorteringen efter att användaren har gett en input
        på hur många scores som kommer att komma in, sedan sorteras det samt även en "Just nu är highscore x".
        Sedan sorteras listan en gång till för att ge den slutgiltliga listan nedan.
         */
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println("This is the ordered list: ");
        for (int i : scores) {
            System.out.println(i);
        }
    }
}

/*
Möjlig förbättring:
Skulle kunna förbättras om det går att göra det mer smidigt med mindre kod, dock så funkar ju sorteringen.
 */