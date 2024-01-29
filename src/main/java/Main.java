import mementoTask.Game;
import mementoTask.SaveFile;
import visitorTask.Cat;
import visitorTask.Dog;
import visitorTask.Pet;
import visitorTask.Turtle;


public class Main {

    public static void main(String[] args) {

        // TODO: Visitor Task

        Pet[] pets = {new Cat(), new Dog(), new Turtle()};

        try {
            for (Pet pet:
                    pets) {
                if (pet instanceof Cat) {
                    ((Cat) pet).checkUpCat();
                } else if (pet instanceof Dog) {
                    ((Dog) pet).checkUpDog();
                } else if(pet instanceof Turtle) {
                    ((Turtle) pet).checkUpTurtle();
                }

            }
        } catch (InterruptedException ex) {
            System.out.println("The program was interrupted unexpectedly");
        }

        System.out.println("===================================");

        // TODO: Memento Task

        Game game = new Game(0, "Newbie");
        game.setLevel(2);
        game.setRank("Amateur");

        // Making a save file from game
        SaveFile save = new SaveFile(game.getLevel(), game.getRank());

        // Creating new game from save file
        game = new Game(save.getLevel(), save.getRank());

        System.out.println(game);

    }
}
