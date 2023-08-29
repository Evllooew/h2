package hogwarts;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;
    private int sumFeatures() {

        return this.diligence + this.loyalty + this.honesty;

    }

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
        if (this.sumFeatures() > hufflepuff.sumFeatures()) {
            System.out.println(getName() + " сильнее " + hufflepuff.getName());
        } else {
            System.out.println(hufflepuff.getName() + " сильнее " + getName());
        }

    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence + ", " + super.toString() +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
