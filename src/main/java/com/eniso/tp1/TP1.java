/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;


import static java.lang.Math.log;
import java.util.Scanner;

/**
 *
 * @author ABDOU
 */
public class Tp1 {

    public static void main(String[] args) {
        System.out.println("Bonjour Mon Premier Tp en POO");
        System.out.println("Votre Nom");
        Scanner read = new Scanner(System.in);
        String name = read.next() ;
        System.out.println("Bonjour \t "+name);
        System.out.println("Votre Age \t "+name + "?");
        read = new Scanner(System.in);
        int a ;
        a= read.nextInt();
        System.out.println(name + "\t Votre Age est \t" + a);
        
        
        
        
        read = new Scanner(System.in);
        System.out.println("donner taille de matrice");
        int n=read.nextInt();
        System.out.println("donner taille de matrice");
        int k=read.nextInt();
        int[][]image=new int[n][k];
        for (int i=0 ; i<n ; i++){
           for (int j=0 ; j<k ; j++){
               System.out.println("donner element"+i+","+j);
               image[i][j]=read.nextInt();
           }
        }
        
        double H = CalculateEntropy(image);
        System.out.println(H);
        
        
        
     
              
        
    }

    public static double[] CalculateProbability(int[][]image){
       int s=0 ; 
       double [] P = new double[254] ; 
       for (int i=0 ; i<255 ; i++){
           for (int[] image1 : image){
               for(int k=0 ; k< image1.length ; k++){
                   if  ( image1[k] ==i){
                       s++;
                   }
               }
           }
           P[i]= (s/ (image.length * image[i].length));
           
       }
      return (P);
    }
   
public static double CalculateEntropy(int[][]image){
      double H=0 ;
      double[]P = CalculateProbability(image);
      for (int i=0 ; i<255 ; i++){
            H-=P[i]*log( P[i]) ;
                    }
        return (H);
     }
      
     

}