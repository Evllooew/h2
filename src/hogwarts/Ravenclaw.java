package hogwarts;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int power, int transpiration, int intelligence, int wisdom, int wit, int creativity) {
        super(name, power, transpiration);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compare(Ravenclaw ravenclaw) {
        if (intelligence + wisdom + wit + creativity > ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity()) {
            System.out.println(name + " сильнее " + ravenclaw.getName());
        } else {
            System.out.println(ravenclaw.getName() + " сильнее " + name);
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


}
