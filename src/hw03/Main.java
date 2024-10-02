package hw03;
/**
 * Author:        Adam Dixon
 * Description: This is the main Class for testing functionality
 */
public class Main {
    public static void main(String[] args) {
        // testing with integers
        sortedSet<Integer> set1 = new sortedSet<>();
        set1.add(12);
        set1.add(6);
        set1.add(3);
        set1.add(10);
        System.out.println("Set of integers: " + set1.toString());
        set1.remove(4);
        set1.add(6);
        System.out.println("Set of integers removing 4 and adding 6: " + set1.toString());
        System.out.println("Size of set: " + set1.size());
        System.out.println("Element at index 1 is: " + set1.get(1));

        // testing with doubles
        sortedSet<Double> set2 = new sortedSet<>();
        set2.add(4.2);
        set2.add(7.6);
        set2.add(2.3);
        set2.add(1.5);
        System.out.println("Set of doubles: " + set2.toString());
        set2.remove(2.3);
        set2.add(3.8);
        System.out.println("Set of doubles after removing 2.3 and adding 3.8: " + set2.toString());
        System.out.println("Size of the set is: " + set2.size());
        System.out.println("Element at index 2 is: " + set2.get(2));

        // testing with strings
        sortedSet<String> set3 = new sortedSet<>();
        set3.add("Dog");
        set3.add("Car");
        set3.add("Tetris");
        set3.add("Mother");
        System.out.println("Set of strings: " + set3.toString());
        set3.remove("Tetris");
        set3.add("Puzzles");
        System.out.println("Set of strings after removing Tetris and adding Puzzles: " + set3.toString());
        System.out.println("Size of the set is: " + set3.size());
        System.out.println("Element at index 1 is: " + set3.get(1));

        // testing with movie objects
        sortedSet<Movie> set4 = new sortedSet<>();
        set4.add(new Movie("Dispicable Me"));
        set4.add(new Movie("Scarface"));
        set4.add(new Movie("StarWars: Clone Wars"));
        set4.add(new Movie("The Lord of the Rings"));
        System.out.println("Set of movies: " + set4.toString());
        set4.remove(new Movie("The Clone Wars"));
        set4.add(new Movie("SuperMan"));
        System.out.println("Set of movies removing StarWars: Clone Wars and adding SuperMan: " + set4.toString());
        System.out.println("Size of the set is: " + set4.size());
        System.out.println("Element at index 2 is: " + set4.get(2));
    }
}

