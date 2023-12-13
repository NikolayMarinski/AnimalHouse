package bg.smg;

public class Main {



    public static void main(String[] args) {

        AnimalHouse<Tiger> tigerHouse = new AnimalHouse<Tiger>();
        Tiger tiger = new Tiger();
        tiger.name = "Death";
        tigerHouse.animal = tiger;

        AnimalHouse<Bird> birdHouse = new AnimalHouse<Bird>();
        Bird bird = new Bird();
        bird.highOfFlight = 156.5;
        birdHouse.animal = bird;

    }
}
