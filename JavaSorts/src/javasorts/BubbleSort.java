/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Scanner;

public class BubbleSort {
    public static void bSort(int array[]){
     for(int fase=1;fase<array.length;fase++){
        for(int comp=0;comp<array.length-fase;comp++){
           if(array[comp]>array[comp+1]){
              int temp = array[comp];
              array[comp] = array[comp+1];
              array[comp+1] = temp;
           }// fim if
        }// for comp
     }// fim for fase
    }// fim bSort
    
    public static void bSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int fase=1;fase<array.length;fase++){
            System.out.println("Fase "+fase);//
            JavaSorts.printArray(array);//
            scanner.nextLine();// pause
        for(int comp=0;comp<array.length-fase;comp++){
            System.out.println
              ("Comparando "+array[comp]+ " com " + 
                                      array[comp+1]);//
            if(array[comp]>array[comp+1]){
                System.out.println("Trocou");  //
              int temp = array[comp];
              array[comp] = array[comp+1];
              array[comp+1] = temp;
           }// fim if
        }// for comp
     }// fim for fase
    }// fim bSort
    
         public static void bSortDescComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int fase=1;fase<array.length;fase++){
             boolean ordem = false;
            System.out.println("Fase "+fase);
            JavaSorts.printArray(array);
            scanner.nextLine();//pause
            for(int comp=0;comp<array.length-fase;comp++){
                System.out.println("Comparando "+array[comp] + " com " + array[comp+1]);
                if(array[comp]<array[comp+1]){// Modificação: < ao invés de >
                    System.out.println("Trocou");
                    ordem = true;
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }//fim if
            }//fim for comp
            if(ordem == false){
                System.out.println("Já está ordenado!");
                return;
            }
        }//fim for fase
    }//fim bSortDescComentado
}

      
