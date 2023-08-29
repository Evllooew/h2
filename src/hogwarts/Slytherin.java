package hogwarts;

public class Slytherin extends Hogwarts  {
    private int cunning;
    private int determination;
    private int ambition;
    private int  resourcefulness;
    private int sumFeatures() {

        return this.cunning + this.determination + this.ambition + this.resourcefulness;

    }


    public Slytherin(String name, int power, int transpiration, int cunning, int determination, int ambition, int resourcefulness) {
        super(name, power, transpiration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public void compare (Slytherin slytherin){
        if (this.sumFeatures() > slytherin.sumFeatures()){
            System.out.println(getName() + " сильнее " + slytherin.getName());
        } else { System.out.println( slytherin.getName() + " сильнее " + getName());
        }

    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    @Override
    public String toString() {
        return "Slytherin{" + ", " + super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                '}';
    }
}
