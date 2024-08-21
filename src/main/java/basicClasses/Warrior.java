package main.java.basicClasses;

public class Warrior  extends Fighters{
    private double stamina;

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    @Override
    public String attack1() {
        return "";
    }

    @Override
    public String attack2() {
        return "";
    }

    @Override
    public String attack3() {
        return "";
    }

    @Override
    public void getInfo() {

    }
}
