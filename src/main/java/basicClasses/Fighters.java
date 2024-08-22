package main.java.basicClasses;



public abstract class Fighters {
    private String name;
    private double health;
    private double damage;
    private String nameOfTheBaseAbility;
    public abstract void attack1 ();
    public abstract void attack2 ();
    public abstract void attack3 ();
    public abstract void getInfo();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getNameOfTheBaseAbility() {
        return nameOfTheBaseAbility;
    }

    public void setNameOfTheBaseAbility(String nameOfTheBaseAbility) {
        this.nameOfTheBaseAbility = nameOfTheBaseAbility;
    }



}
