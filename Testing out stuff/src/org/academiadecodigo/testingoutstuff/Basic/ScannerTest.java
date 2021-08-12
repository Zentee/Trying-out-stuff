package org.academiadecodigo.testingoutstuff.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {





        // Scanner input a int and get a grade.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade: ");

        int n = scanner.nextInt();

        if(n >= 90 && n <= 100) {
            System.out.println("A");

        }else if (n >= 80 && n <= 90){
            System.out.println("B");

        }else if (n >=70 && n <= 80){
            System.out.println("C");

        }else if (n >=65 && n <= 70){
            System.out.println("D");
        }else if (n >= 0 && n <= 65){
            System.out.println("F");
        }else{
            System.out.println("you dun goofed");
        }

        // method for scanning words

        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);  // scannear
        ArrayList<String> words = new ArrayList<>(); // criar um array de strings

        while(scan.hasNext()){ //vai ver se tem palavras se tiver entramos no while loop
            words.add(scan.next()); //aqui e que insere na variavel words cada palavra
        }

        System.out.println(words);


        //Um simples scan method para caso se um user em vez de por um numero puser uma string ou outra merda.

        Scanner scan1 = new Scanner(System.in);
        System.out.println("What's your fav number");

        try {
            int z = scan1.nextInt();
            System.out.println(n);

        }catch(Exception e){
            System.out.println("Sorry, please enter a number");
        }



    }
}
