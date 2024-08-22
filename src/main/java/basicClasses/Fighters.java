package main.java.basicClasses;



public abstract class Fighters {
    private String name;
    private int health;
    private int damage;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getNameOfTheBaseAbility() {
        return nameOfTheBaseAbility;
    }

    public void setNameOfTheBaseAbility(String nameOfTheBaseAbility) {
        this.nameOfTheBaseAbility = nameOfTheBaseAbility;
    }



}
