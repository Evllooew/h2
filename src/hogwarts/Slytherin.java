package hogwarts;

public class Slytherin extends Hogwarts  {
    private int cunning;
    private int determination;
    private int ambition;
    private int  resourcefulness;


    public Slytherin(String name, int power, int transpiration, int cunning, int determination, int ambition, int resourcefulness) {
        super(name, power, transpiration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public void compare (Slytherin slytherin){
        if (cunning + determination + ambition + resourcefulness>  slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness()){
            System.out.println(name + " сильнее " + slytherin.getName());
        } else { System.out.println( slytherin.getName() + " сильнее " + name);
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


}
