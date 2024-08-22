package main.java.basicClasses;

import java.util.ArrayList;
import java.util.Random;

public abstract class Ninja extends Fighters {
    private int chakra;
    Random random;

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public abstract ArrayList<String> listForAttack();

    @Override
    public void attack1() {
    }

    @Override
    public void attack2() {

    }

    @Override
    public void attack3() {
    }

    public void something() {
    }

    @Override
    public void getInfo() {

    }

    public void randomAttack() {

    }
}
