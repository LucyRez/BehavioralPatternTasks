package visitorTask;

import visitorTask.Pet;

import java.util.Random;

public class Turtle implements Pet {

    int healthState = 0;

    public Turtle() {
        Random random = new Random();
        healthState = random.nextInt(2);
    }

    public void checkUpTurtle() throws InterruptedException {
        System.out.println("Checking up on turtle...");
        Thread.sleep(2000);
        System.out.println("Checking the shell...");
        Thread.sleep(2000);
        if (healthState == 0) {
            System.out.println("The turtle is doing fine");
            return;
        }

        System.out.println("The turtle is sick :(");
    }
}
