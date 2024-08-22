package main.java.character;

import main.java.basicClasses.Ninja;

import java.util.ArrayList;
import java.util.Random;

public class NinjaGaara extends Ninja {
    Random random = new Random();
    private ArrayList<String> nameAttack;

    public NinjaGaara() {
        this.setHealth(1000);
        this.setChakra(5000);
        this.setName("ДЖЕНЧУРИКИ ГААРА");
        nameAttack = new ArrayList<>();
        nameAttack.add("ПЕСЧАНЫЕ КОЛЬЯ");
        nameAttack.add("ПЕСЧАНЫЕ ТЕСКИ");
        nameAttack.add("ПЕСЧАНАЯ РУКА");
    }

    public ArrayList<String> listForAttack() {
        return nameAttack;
    }

    public void getInfo() {
        this.setNameOfTheBaseAbility("Базовый навык - ПОДВИЖНАЯ СТЕНА ПЕСКА");
        System.out.println(this.getName() + "\n"
                + "БАЗОВОЕ КОЛИЧЕСТВО ЖИЗНИ: " + this.getHealth() + "\n" + this.getNameOfTheBaseAbility());
        System.out.println("Объём чакры персонажа " + this.getChakra());

    }

    // У каждого персонажа по 3 атаки :
    public void attack1() {
        String attack = nameAttack.get(0);
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(100 + (random.nextInt(81)));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 300);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
    }

    public void attack2() {
        String attack = nameAttack.get(1);
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(150 + (random.nextInt(81)));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 480);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
    }

    public void attack3() {
        String attack = nameAttack.get(2);
        System.out.println("ГААРА НАНОСИТ УДАР");
        this.setDamage(200 + (random.nextInt(81)));
        System.out.println("ГААРА НАНЁС " + this.getDamage() + " УРОНА ПРОТИВНИКУ ПРИМЕНИВ " + attack);
        this.setChakra(this.getChakra() - 500);
        System.out.println("ОСТАТОК ЧАКРЫ " + this.getChakra());
    }

    // при достижении критического порога HP происходит чистичная регенерация
    public void something() {
        System.out.println("Активация ярости");
        this.setHealth(getHealth() + 500);
        this.setChakra(getChakra() + 1500);
        System.out.println(this.getName() + " впадает в ярость! Следующие атаки противника наносят в 2 раза меньше" +
                "урона. \n Частично восполнены HP и чакра");
    }

    @Override
    public void randomAttack() {
        int attackNumber = random.nextInt(3); // Генерирует случайное число от 0 до 2
        switch (attackNumber) {
            case 0:
                attack1();
                break;
            case 1:
                attack2();
                break;
            case 2:
                attack3();
                break;
            default:
                System.out.println("Ошибка выбора атаки");
        }
    }
}

