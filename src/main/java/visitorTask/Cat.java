package visitorTask;

import visitorTask.Pet;

import java.util.Random;

public class Cat implements Pet {

    int healthState = 0;

    public Cat() {
        Random random = new Random();
        healthState = random.nextInt(2);
    }

    public void checkUpCat() throws InterruptedException {
        System.out.println("Checking up on cat...");
        Thread.sleep(2000);
        System.out.println("Checking the fur...");
        Thread.sleep(2000);
        System.out.println("Checking the whiskers...");
        Thread.sleep(2000);
        if (healthState == 0) {
            System.out.println("The cat is doing fine");
            return;
        }

        System.out.println("The cat is sick :(");
    }

}
