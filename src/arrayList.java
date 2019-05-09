/*
   Psuedokod:
   Fråga om användarens poäng
   Lägg in det i en ArrayList
   Sortera antalet
    */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>();
        int score;
        do {
            System.out.println("Skriv in ditt poäng här");
            score = sn.nextInt();

            if (score != -1) {
            {
                //ta reda på index.
                    int index;
                    //vart ska poängen vara
                for (int i = 0; i < list.size(); i++) {
                    /*
                    Om score är större än det som finns, ska den vara på den raden.
                     */
                }
                //list.add(index,score);
                }
            }
        } while (score != -1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
