package main.java;

import main.java.basicClasses.Ninja;
import main.java.character.NinjaGaara;
import main.java.character.NinjaSaske;

import java.util.ArrayList;
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
                " о персонаже c информацией об атаках ?");
            usersChoice = scanner.nextLine();
        if (usersChoice.equalsIgnoreCase("да") || usersChoice.equalsIgnoreCase("yes")) {
            playerFighter.getInfo();
            ArrayList<String> playersAttack = playerFighter.listForAttack();
            System.out.println("\nАтаки персонажа :");
            for (String attacks : playersAttack) {
                System.out.println(attacks);
            }
        }
        System.out.println("Добро пожаловать на жеребьёвку! Сейчас мы узнаем, кто атакует первым !");
           int draw = Arena.theDraw();
        if (draw == 1) {
            System.out.println("Первым атакует " + playerFighter.getName());

        } else {
            System.out.println("Первым атакует " + randomFighter.getName() + ", приготовься!");
        }
            while (true) {
                if (draw == 1) {
                    System.out.println("Твой ход! Выбери атаку из доступных:");
                    ArrayList<String> playerAttacks = playerFighter.listForAttack();
                    for (int i =0; i < playerAttacks.size(); i++) {
                        System.out.println((i +1) + " " + playerAttacks.get(i));

                    }
                    scanner.nextLine();

                } else  if (draw == 0) {
                    randomFighter.randomAttack();
                    playerFighter.setHealth(playerFighter.getHealth() - randomFighter.getDamage());
                    System.out.println(playerFighter.getName() + " получил " + randomFighter.getDamage() + " урона." +
                            " Остаток жизни " + playerFighter.getHealth());
                    draw = 1;
                }
            }

    }

}
