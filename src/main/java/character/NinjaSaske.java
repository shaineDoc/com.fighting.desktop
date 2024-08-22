package main.java.character;

import main.java.basicClasses.Ninja;


import java.util.ArrayList;
import java.util.Random;

public class NinjaSaske extends Ninja {
    Random random = new Random();
    private ArrayList<String> nameAttack; // для списка имени атак

    public NinjaSaske() {
        this.setHealth(1000);
        this.setChakra(5000);
        this.setName("УЧИХА САСКЕ");
        this.nameAttack = new ArrayList<>();
        this.nameAttack.add("ЧИДОРИ");
        this.nameAttack.add("КАТОН: ШАР ОГНЯ");
        this.nameAttack.add("ГЕНДЗЮТСУ: ИЛЛЮЗИЯ УБИЙСТВА");

    }

    public ArrayList<String> listForAttack() {
        return nameAttack;
    }


    public void getInfo() {

        this.setNameOfTheBaseAbility("Базовый навык - ШАРИНГАН");
        System.out.println(this.getName() + "\n"
                + "БАЗОВОЕ КОЛИЧЕСТВО ЖИЗНИ: " + this.getHealth() + "\n" + this.getNameOfTheBaseAbility());
        System.out.println("Объём чакры персонажа " + this.getChakra());

    }
    // У каждого персонажа 3 атаки:

    public void attack1() {
        String attack = nameAttack.get(0);
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(100 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 300);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
    }

    public void attack2() {
        String attack = nameAttack.get(1);
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(150 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 400);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());

    }

    public void attack3() {
        String attack = nameAttack.get(2);
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(200 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 550);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());

    }

        // при достижении критического порога HP происходит чистичная регенерация
    public void something() {
        System.out.println("Активация проклятой печати");
        this.setHealth(getHealth() + 500);
        this.setChakra(getChakra() + 1500);
        System.out.println(this.getName() + " активировал печать. Следующая атака наносит двойной урон " +
                "\n Частично восполнены HP и чакра");
    }
}


