import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Merge Unique Elements
        System.out.println("Task1:");
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("To Kill a MockingBird");
        books1.add("The Master and Margarita");
        books1.add("The Little Prince");
        books1.add("Crime and Punishment");
        books1.add("Three Comrades");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Dune");
        books2.add("Crime and Punishment");
        books2.add("The Shining");
        books2.add("Atlas Shrugged");
        books2.add("To Kill a MockingBird");
        books2.add("1984");

        for (int i = 0; i < books2.size(); i++) {
            String innerBook2 = books2.get(i);
            if (!books1.contains(innerBook2)) {
                books1.add(innerBook2);
            }
        }
        System.out.println(books1);

        //Find Maximum Element
        System.out.println("Task2:");
        ArrayList<String> movieTitles = new ArrayList<>();
        movieTitles.add("Soulmates");
        movieTitles.add("SummerStrike");
        movieTitles.add("WeakHero");

        String longest = "";
        int a = 0;

        for (int i = 0; i < movieTitles.size(); i++) {
            String title = movieTitles.get(i);
            if (title.length() > a) {
                a = title.length();
            }
        }

        for (int i = 0; i < movieTitles.size(); i++) {
            String title = movieTitles.get(i);
            if (title.length() == a) {
                longest = title;
            }
        }
        System.out.println(longest);

        //Count Occurrences
        System.out.println("Task3:");
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("FrenchFries");
        foods.add("Burger");
        foods.add("Pizza");
        foods.add("Pizza");
        foods.add("Pizza");

        int count = 0;
        for (int i = 0; i < foods.size(); i++) {
            String food = foods.get(i);
            if (food.equals("Pizza")) {
                count += 1;
            }
        }
        System.out.println(count);

        //Remove all matching elements
        System.out.println("Task4:");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (fruit == "Banana") {
                fruits.remove(fruit);
            }
        }
        System.out.println(fruits);

        //Replace all elements
        System.out.println("Task5:");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Blue");
        colors.add("Pink");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }
        System.out.println(colors);

        //Check Sublist Presence
        System.out.println("Task6:");
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Volleyball");

        if (sports.contains("Football") || sports.contains("Tennis")) {
            System.out.println("It contains");
        } else {
            System.out.println("It doesnt contain");
        }


        //Find Index of Element
        System.out.println("Task7:");
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulips");
        flowers.add("Lilies");


        //Remove Duplicates
        System.out.println("Task8:");
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Deer");
        animals.add("Rabbit");
        animals.add("Lynx");
        animals.add("Deer");
        animals.add("Bear");

        for (int i = 0; i < animals.size(); i++) {
            String animal = animals.get(i);for (int j = animals.size()-1; j > i; j--) {
                String animal2 = animals.get(j);
                if (animal == animal2) {
                    animals.remove(j);
                }

            }
        }
        System.out.println(animals);

        //
    }
}