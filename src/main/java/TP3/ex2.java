/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] tableau = new int[10];

       
        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

      
        System.out.print("Le tableau que vous avez saisi est : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
    
}
