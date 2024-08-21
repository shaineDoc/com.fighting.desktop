package main.java;

import main.java.basicClasses.Ninja;
import main.java.character.NinjaGaara;
import main.java.character.NinjaSaske;

import java.util.Scanner;

public class Arena {
    private static int theDraw() {  // случайный выбор очередности хода
        int i;
        i = (int) (2 * Math.random());
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ninja playerFighter = null; // Выбор персонажа пользователем
        Ninja randomFighter = null; // Выбор персонажа компьютером

        System.out.println("ВЫБЕРИ СВОЕГО ПЕРСОНАЖА: \n САСКЕ ИЛИ ГААРА? ");
        String usersChoice = scanner.nextLine();
        while (playerFighter == null) {
            if (usersChoice.equalsIgnoreCase("САСКЕ") || usersChoice.equals(String.valueOf(1))) {
                playerFighter = new NinjaSaske();
                randomFighter = new NinjaGaara();
            } else if (usersChoice.equalsIgnoreCase("ГААРА") || usersChoice.equals(String.valueOf(2))) {
                playerFighter = new NinjaGaara();
                randomFighter = new NinjaSaske();
            } else {
                System.out.println("Ошибка, попробуй ещё раз: ");
                usersChoice = scanner.nextLine();
            }
        }
        System.out.println("Отлично! Ты выбрал " + playerFighter.getName() + "\n Получить базовую информацию" +
                " о персонаже ?");

        if (scanner.nextLine().equalsIgnoreCase("да")) {
            playerFighter.getInfo();
        }

        System.out.println("Добро пожаловать на жеребьёвку! Сейчас мы узнаем, кто атакует первым !");
        Arena.theDraw();
        if (Arena.theDraw() == 1) {
            System.out.println("Первым атакует " + playerFighter.getName() + " твои действия ?");
        } else {
            System.out.println("Первым атакует " + randomFighter.getName() + ", приготовься!");
        }
    }

}
