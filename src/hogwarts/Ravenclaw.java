package hogwarts;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    private int sumFeatures() {

        return this.intelligence + this.wisdom + this.wit + this.creativity;

    }
    public Ravenclaw(String name, int power, int transpiration, int intelligence, int wisdom, int wit, int creativity) {
        super(name, power, transpiration);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compare(Ravenclaw ravenclaw) {
        if (this.sumFeatures() > ravenclaw.sumFeatures()) {
            System.out.println(getName() + " сильнее " + ravenclaw.getName());
        } else {
            System.out.println(ravenclaw.getName() + " сильнее " + getName());
        }

    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + ", " + super.toString() + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
