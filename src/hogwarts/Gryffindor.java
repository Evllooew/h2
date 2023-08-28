package hogwarts;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int braveryy;

    public Gryffindor(String name, int power, int transpiration, int nobility, int honor, int braveryy) {
        super(name, power, transpiration);
        this.nobility = nobility;
        this.honor = honor;
        this.braveryy = braveryy;
    }

    public void compare(Gryffindor gryffindor) {
        if (nobility + honor + braveryy > gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBraveryy()) {
            System.out.println(name + " сильнее " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " сильнее " + name);
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


}



