package visitorTask;

import visitorTask.Pet;

import java.util.Random;

public class Dog implements Pet {
    int healthState = 0;

    public Dog() {
        Random random = new Random();
        healthState = random.nextInt(2);
    }

    public void checkUpDog() throws InterruptedException {
        System.out.println("Checking up on dog...");
        Thread.sleep(2000);
        System.out.println("The tail is wagging...");
        Thread.sleep(2000);
        System.out.println("Checking the nose...");
        Thread.sleep(2000);
        if (healthState == 0) {
            System.out.println("The dog is doing fine");
            return;
        }

        System.out.println("The dog is sick :(");
    }
}
