package hogwarts;

import java.util.Random;

public abstract class Hogwarts {
    protected String name;
    private int power;
    private int transpiration;

    public Hogwarts(String name, int power, int transpiration) {
        this.name = name;
        this.power = power;
        this.transpiration = transpiration;
    }

    public void compare(Hogwarts hogwarts) {
        if (power + transpiration > hogwarts.getPower() + hogwarts.getTranspiration()) {
            System.out.println(name + " сильнее " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " сильнее " + name);
        }


    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTranspiration() {
        return transpiration;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "power=" + power +
                ", transpiration=" + transpiration +
                '}';
    }
}
