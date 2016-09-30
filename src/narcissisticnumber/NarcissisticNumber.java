/*
 * To change this license header, choose License Headers in Project Properties.
 * Narcissictic number is a 3-digit number, in which the sum of each digit number cubed eaquals
to itself.
 * 
 */
package narcissisticnumber;

/**
 *
 * @author Shaojie
 */
public class NarcissisticNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The narcissitic number is: ");
        for(int i=100;i<1000;i++){
        int a = i/100;
        int b = (i-a*100)/10;
        int c = i%10;
        int d = a*a*a+b*b*b+c*c*c;
        if(d==i) System.out.print(d+" ");
        }
    }
    
}
