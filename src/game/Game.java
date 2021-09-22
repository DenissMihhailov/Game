/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ИГРА УГАДАЙ ЧИСЛО");
        System.out.println("--------------------------");
        System.out.println("Напишите от какого числа игра начнет счет:");
        int otnum= scanner.nextInt();
        System.out.println("Напишите от какого числа игра начнет счет:");
        int donum= scanner.nextInt();
        
        int max = donum, min =otnum, attempt=1, ii=1;
        while(ii==1){
        Random random= new Random();
        int gameNum = random.nextInt(max - min + 1)+min;
        System.out.printf("Программа задала число от %d до %d, угадай:", otnum, donum); 
        for(int i=0;i<10;i++){
            int userNum= scanner.nextInt(); 
            if(gameNum==userNum){
                System.out.println("Ура! Ты выйграл!");
                ii=ii-1;
                break;
            }else{
                if(attempt < 3){
                    System.out.println("Неправильно, попробуй еще раз:");
                }else{
                    System.out.println("Ты проиграл... Задумано число:" + gameNum);
                    System.out.println("Хотите сыграть еще раз? Если да наберите 1, если нет любое другое число:");
                    int choice= scanner.nextInt();
                    if(choice==1){
                        attempt=1;
                        break;
                    }else{
                        ii=ii-1; 
                        System.out.println("Пока!");
                         break;
                    }
                
            }
        } 
        attempt++;
        
    }
    }
    }
}
