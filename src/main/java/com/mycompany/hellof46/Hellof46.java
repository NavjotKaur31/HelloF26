/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hellof46;
import java.util.Scanner;

/**
 *this comment is added to show push
 * @author DELL
 */
public class Hellof46 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Enter the String:");
        Scanner input=new Scanner(System.in);
        String myWord =input.nextLine();//string length methodd
        char [] myLetters=new char[myWord.length()];//because we donot know the length of the array that is wby .length is used
        
        for (int i=0;i<myLetters.length;i++){//arrey length propertyy
            myLetters[i]=myWord.charAt(i);
        }
        for(int i=myLetters.length-1;i>=0;i--)
        {
            System.out.println(myLetters[i]);
        }
    }
    
}
