package main.java.basicClasses;

import java.util.ArrayList;

public abstract class Ninja extends Fighters{
    private double chakra;

    public double getChakra() {
        return chakra;
    }

    public void setChakra(double chakra) {
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
}
