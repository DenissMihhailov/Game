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
        int max = 5, min =0;
        Random random= new Random();
        int gameNum = random.nextInt(max - min + 1)+min;
        System.out.println("Программа задала число от 0 до 5, угадай:"); 
        Scanner scanner = new Scanner(System.in);
        int userNum= scanner.nextInt(); 
        if(gameNum==userNum){
            System.out.println("Ура! Ты выйграл!");
        
        }else{
            System.out.println("Ты проиграл... Задумано число:" + gameNum);
        }
    }
    
}
