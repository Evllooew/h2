package hogwarts;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int braveryy;
    private int sumFeatures() {

        return this.nobility + this.honor + this.braveryy;

    }

    public Gryffindor(String name, int power, int transpiration, int nobility, int honor, int braveryy) {
        super(name, power, transpiration);
        this.nobility = nobility;
        this.honor = honor;
        this.braveryy = braveryy;
    }

    public void compare(Gryffindor gryffindor) {
        if (this.sumFeatures() > gryffindor.sumFeatures()) {
            System.out.println(getName() + " сильнее " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " сильнее " + getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBraveryy() {
        return braveryy;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", " + super.toString() +
                ", honor=" + honor +
                ", braveryy=" + braveryy +
                '}';
    }
}



