import hogwarts.*;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("harry ", 1, 2, 3, 4, 5),
                new Gryffindor("Germany ", 5, 3, 3, 8, 2),
                new Gryffindor("Ron ", 3, 7, 3, 4, 9),
                new Hufflepuff("Drako ", 3, 7, 3, 2, 1),
                new Hufflepuff("Graham ", 3, 7, 3, 2, 1),
                new Hufflepuff("Gregory ", 3, 7, 3, 2, 1),
                new Ravenclaw("Zacharias", 1, 6, 8, 3, 6, 2),
                new Ravenclaw("Cedric", 2, 8, 1, 6, 9, 2),
                new Ravenclaw("Justin", 2, 1, 1, 6, 9, 2),
                new Slytherin("Cho", 1, 2, 8, 4, 1, 3),
                new Slytherin("Padma", 9, 3, 2, 5, 1, 3),
                new Slytherin("Marcus", 2, 2, 5, 2, 1, 3),


        };
        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i + 1; j < hogwarts.length; j++)
                hogwarts[i].compare(hogwarts[j]);

        }
        Gryffindor harry = (Gryffindor) hogwarts[0];
        Gryffindor germ = (Gryffindor) hogwarts[1];
        harry.compare(germ);

    }
}