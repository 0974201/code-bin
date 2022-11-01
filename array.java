//todo: fix de 2d array hier pls. 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prte1.vraag.pkg1;

import java.util.Arrays;

/**
 *
 * @author
 */

public class PRTE1Vraag1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //1d array met ingevulde values
        
        //numbers[9] = 107; //veranderd de value van nummer dat op slot 9 is ingevuld
        
        //final int LENGTH = 10; //maakt 1d array waar values zelf ingevuld moeten worden
        //int[] numbers = new int [LENGTH];
        /*numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;*/
        
        //System.out.println(numbers[9]);
        
        /*for(int index : numbers){ //for loop
            System.out.println(index);
        }*/
        
        /*for(int i = 0; i < numbers.length; i++){ //enhanced for loop
            System.out.println(numbers[i]);
        }*/
        
        /*for(int i = 0; i < numbers.length; i++){ //zet de values van een array naar 0
            numbers[i] = 0;
            System.out.println(numbers[i]);
        }*/
        
        /*for(int i = 5; i < numbers.length; i++){ //print de array vanaf een bepaalde punt
            System.out.println(numbers[i]);
        }*/
        
        /*for(int i = 0; i < numbers.length; i++){ //telt de waardes in een array met elkaar op
            numbers[i] = i + i;
            System.out.println(numbers[i]);
        }*/
        
        /*for(int i = 0; i < numbers.length; i++){ //separeert de elementen in een array
            if(i > 0){
                System.out.print(" , ");
            }
            System.out.print(numbers[i]);
        }*/
        
        /*for (int i = 0; i <= 10; i++) { //print een leuke blok met cijfers
            System.out.print(i + ": ");
            for (int j = 0; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        
        /*int[] values = {-3, -111, 7, 42};
        Arrays.sort(values); //sorteert de waarden in een array
        for (int value : values) {
            System.out.println(value);
        }*/

        int[][] table = {
            {1, 0, 7},
            {1, 1, 8},
            {1, 7, 6},
            {1, 5, 5},
            {1, 1, 4},
            {7, 8, 9}
        };
        
        /*int[][] table;
        table = new int [6][3];*/
        
        int row, col;
        for(row = 0; row < 6; row++){
            for(col = 0; col < 3; col++){
                System.out.printf("%7d", table[row][col]);
                //System.out.println(table[row][col]);
            }
            System.out.println();
        }
    }
     
}