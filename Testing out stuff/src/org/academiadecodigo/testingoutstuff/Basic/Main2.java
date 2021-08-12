package org.academiadecodigo.testingoutstuff.Basic;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        /* Exceptions primeiro exemplo com varios tipos de exceçpºões diferentes que sao apanhados um a aum

        try {

            int[] a = {4};
            System.out.println(a[1]);

        }catch (NullPointerException e){
            System.out.println("Your array is null!");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds");
        }catch(Exception e){
            System.out.println("Something else went wrong!");
        }



        */




        /* Arraylist e listas no geral melhor porque não temos que estar a criar novos arrays.
           Lembrar que para dar print e preciso fazer .get e o numero do index que queremos.


        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");

        fruitList.remove("Strawberry");
        fruitList.clear();

        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);


        */


            /* I/O a bit


            File file = new File("C:\\Users\\Zent\\Desktop\\Casting niji.txt");

            Scanner scan = new Scanner(file);

            String fileContent= "";

            while(scan.hasNextLine()) {
                fileContent = fileContent.concat(scan.nextLine() + "\n");

            }

            FileWriter writer = new FileWriter("C:\\Users\\Zent\\Desktop\\newfile.txt");
            writer.write(fileContent);
            writer.close();

                */



        }


    }
