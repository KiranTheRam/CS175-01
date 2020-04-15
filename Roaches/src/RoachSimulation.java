public class RoachSimulation {
    public static void main(String[] args) {
        RoachPopulation bugs = new RoachPopulation(10);

        System.out.println("Initial roach population: "+bugs.getRoaches());
        bugs.breed();               // Breed method doubles the population
        System.out.println("Roach population after cycle 1  breeding): "+bugs.getRoaches());
        bugs.spray(50);     // 50% population reduction
        System.out.println("Roach population after cycle 1 50% spraying: "+bugs.getRoaches());

        bugs.breed();               // Breed method doubles the population
        System.out.println("Roach population after cycle 2  breeding: "+bugs.getRoaches());
        bugs.spray(60);     // 60% population reduction
        System.out.println("Roach population after cycle 2 60% spraying: "+bugs.getRoaches());

        bugs.breed();               // Breed method doubles the population
        System.out.println("Roach population after cycle 3  breeding: "+bugs.getRoaches());
        bugs.spray(70);     // 70% population reduction
        System.out.println("Roach population after cycle 3 70% spraying: "+bugs.getRoaches());

        bugs.breed();               // Breed method doubles the population
        System.out.println("Roach population after cycle 4  breeding: "+bugs.getRoaches());
        bugs.spray(80);     // 80% population reduction
        System.out.println("Roach population after cycle 4 80% spraying: "+bugs.getRoaches());

    }
}
