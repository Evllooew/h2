package hogwarts;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int power, int transpiration, int diligence, int loyalty, int honesty) {
        super(name, power, transpiration);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void compare(Hufflepuff hufflepuff) {
        if (diligence + loyalty + honesty > hufflepuff.getDiligence() + hufflepuff.getLoyalty() + hufflepuff.getHonesty()) {
            System.out.println(name + " сильнее " + hufflepuff.getName());
        } else {
            System.out.println(hufflepuff.getName() + " сильнее " + name);
        }

    }


}
