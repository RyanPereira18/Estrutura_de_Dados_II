/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lucyv
 */
public class JavaSorts {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
        int tamanho;
        System.out.println("Tamanho do Vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int [tamanho];
        System.out.println("Dados do Vetor: ");
        for(int i=0;i<vetor.length;i++)
            vetor[i] = scanner.nextInt();
        System.out.println("Vetor Original: ");
        printArray(vetor);
        BubbleSort.bSortDescComentado(vetor);
        //BubbleSort.bSortComentado(vetor);
        System.out.println("Vetor Ordenado: ");
        printArray(vetor);
    }
    
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"| ");
        
        System.out.println("\n");
    }//fim Array
}


