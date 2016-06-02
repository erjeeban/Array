/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.countvowels;

import java.util.Scanner;

/**
 *
 * @author serjhk
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String");

        String str = input.nextLine();

        int i, count = 0, num = 0;
        for (i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            } else {
                num++;

            }

        }
        System.out.println("There are" + count + "vowels");
        System.out.println("There are" + num + "consonant");

        // TODO code application logic here
    }

}
