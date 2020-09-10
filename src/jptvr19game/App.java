/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Привет");
        System.out.println("Поиграем? Укажи диапозон игры.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("min = ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.print("max = ");
        int max = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Программа заудмала число от "+min+" до "+max+", угадай");
        Random random = new Random();
        int attempt = 0;
        do {
            int myNumber = random.nextInt(max - min + 1) + min;
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл! Молодец!");
                break;
            }else{
                if(attempt > 1){
                    System.out.println("Ты проиграл! Было задумано число: "
                    + myNumber);
                break;
            }else{
                    System.out.println("Попробуй ещё раз: ");
                }
                attempt++;
            }
        } while (true);
    }
}