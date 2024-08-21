package main.java.character;

import main.java.basicClasses.Ninja;

import java.util.Random;

public class NinjaSaske extends Ninja {
    Random random = new Random();

    public NinjaSaske() {
        this.setHealth(1000);
        this.setChakra(5000);
        this.setName("УЧИХА САСКЕ");
    }

    public void getInfo() {

        this.setNameOfTheBaseAbility("Базовый навык - ШАРИНГАН");
        System.out.println(this.getName() + "\n"
                + "БАЗОВОЕ КОЛИЧЕСТВО ЖИЗНИ: " + this.getHealth() + "\n" + this.getNameOfTheBaseAbility());
        System.out.println("Объём чакры персонажа " + this.getChakra());

    }
    // У каждого персонажа 3 атаки:

    public String attack1() {
        String nameAttack = "ЧИДОРИ";
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(100 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 300);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

    public String attack2() {
        String nameAttack = "КАТОН: ШАР ОГНЯ";
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(150 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 400);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

    public String attack3() {
        String nameAttack = "ГЕНДЗЮТСУ";
        System.out.println("САСКЕ НАНОСИТ УДАР");
        this.setDamage(200 + (50 * random.nextDouble()));
        System.out.println(this.getName() + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 550);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

}


