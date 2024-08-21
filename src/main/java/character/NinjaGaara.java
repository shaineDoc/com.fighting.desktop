package main.java.character;

import main.java.basicClasses.Ninja;

import java.util.Random;

public class NinjaGaara extends Ninja {
    Random random = new Random();

    public NinjaGaara() {
        this.setHealth(1000);
        this.setChakra(5000);
        this.setName("ДЖЕНЧУРИКИ ГААРА");
    }

    public void listForAttackGaara() {
        System.out.println("ДОСТУПНЫЕ АТАКИ: \n ПЕСЧАНЫЕ КОЛЬЯ \n ПЕСЧАНЫЕ ТЕСКИ \n ПЕСЧАНАЯ РУКА");
    }

    public void getInfo() {
        this.setNameOfTheBaseAbility("Базовый навык - ПОДВИЖНАЯ СТЕНА ПЕСКА");
        System.out.println(this.getName() + "\n"
                + "БАЗОВОЕ КОЛИЧЕСТВО ЖИЗНИ: " + this.getHealth() + "\n" + this.getNameOfTheBaseAbility());
        System.out.println("Объём чакры персонажа " + this.getChakra());

    }
    // У каждого персонажа по 3 атаки :
    public String attack1() {
        String nameAttack = "ПЕСЧАНЫЕ КОЛЬЯ";
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(100 + (50 * random.nextDouble()));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 300);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

    public String attack2() {
        String nameAttack = "ПЕСЧАНЫЕ ТЕСКИ";
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(150 + (50 * random.nextDouble()));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 480);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

    public String attack3() {
        String nameAttack = "ПЕСЧАНАЯ РУКА";
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(200 + (50 * random.nextDouble()));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + nameAttack);
        this.setChakra(this.getChakra() - 500);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
        return nameAttack;
    }

}
