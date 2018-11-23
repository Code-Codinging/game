package www.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Playgame();
    }
    public static void Game() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("请输入你猜的数字：");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            if (num < key) {
                System.out.println("猜大了，猜小点儿");
            } else if (num > key) {
                System.out.println("猜小了，猜大点儿");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }

        }
    }
    public static void Menu() {
        System.out.println("欢迎来到猜数字游戏");
        System.out.println("选择1-玩游戏");
        System.out.println("选择2-退出游戏");
        System.out.println("选择其他-选择错误");
    }

    public static void Playgame() {
        int input = 0;
        do{
            Menu();
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            switch (input) {
                case 1:
                    Game();
                    break;
                case 2:
                    System.out.println("退出游戏");
                    break;
                default:
                    System.out.println("选择错误-请重新选择");
                    break;
            }
        }while(input != 2);
    }
}