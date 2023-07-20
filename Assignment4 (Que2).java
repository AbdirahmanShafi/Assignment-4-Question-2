/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author abdir
 */
public class Assignment4Q2 {
        public static void main(String[] args) {
        
        System.out.println(" Unlabeled Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Loop iteration: " + i);
        }
        
        // Labeled break statement
        System.out.println("\n Labeled Break Statement:");
        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 2 && j == 2) {
                    break outerLoop; 
                }
            }
        }
    }
}
