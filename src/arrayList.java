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
        do {
            System.out.println("Input next score");
            int Score = sn.nextInt();
            scores.add(Score);
        t++;
        }while (t<6);
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println("This is the ordered list: ");
        for (int i : scores) {
            System.out.println(i);
        }
    }
}