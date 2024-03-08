/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.julianvalencia.staircase;

/**
 *
 * @author usuario1
 */
public class StairCase {

    public static void main(String[] args) {
        System.out.println("Pirámide de NxN!");
        staircase(10);
    }
    
    public static void staircase(int n) {
        int CountSpace = n-1;
        int CountCat  = 1;
        String space = " ";
        String gato = "#";
        while ( n>0 ) {
            System.out.println( space.repeat(CountSpace)+gato.repeat(CountCat) );
            CountSpace--;
            CountCat++;
            n--;
        }
    }
}
