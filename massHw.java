import java.util.Arrays;
import java.util.Scanner;

public class massHw {
    public static void main (String[] args){

        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int [][][] array = {
                {{1,1,1},{0,0,0}},
                {{2,2,2},{3,3,3}},
                {{1,1,1},{0,0,0}}
        };

         for (int [][]array2:array){
             for (int []array1:array2){
                 for (int i:array1){
                     System.out.print(i+num+" ");
                 }
             }
         }



    }
}

