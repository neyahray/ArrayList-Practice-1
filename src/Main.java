import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        //Convert ArrayList to Array
        System.out.println("Task9:");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Manas");
        cities.add("Osh");
        cities.add("Bishkek");

        String[] citiesArray = cities.toArray(new String[0]);
        System.out.println(Arrays.toString(citiesArray));

        //Convert Array to ArrayList
        System.out.println("Task10:");
        int[] numbersArray = {1, 44, 7, 18, 9, 32};
        ArrayList<Integer> numbersArrayList= new ArrayList<>();
        for (int i = 0; i < numbersArray.length; i++) {
            int num = numbersArray[i];
            numbersArrayList.add(num);
        }
        System.out.println(numbersArrayList);

        //Find Common Elements
        System.out.println("Task11:");
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("Germany");
        countries1.add("Switzerland");
        countries1.add("Norway");
        countries1.add("Kyrgyzstan");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Germany");
        countries2.add("China");
        countries2.add("Norway");
        countries2.add("Kyrgyzstan");
        countries2.add("Japan");

        ArrayList<String> common = new ArrayList<>();

        for (int i = 0; i < countries1.size(); i++) {
            String country = countries1.get(i);
            if (countries2.contains(country)) {
                common.add(country);
            }
        }
        System.out.println(common);

        //Remove Even-Length Strings
        System.out.println("Task12:");
        ArrayList<String> names = new ArrayList<>();
        names.add("Nuri");
        names.add("Ayana");
        names.add("Dariia");
        names.add("Jibek");
        names.add("Aiperi");
        names.add("Aida");
        names.add("Aybi");


        for (int i = names.size()-1; i >= 0; i--) {
            String name = names.get(i);
            int countForName =  name.length();
            if (countForName % 2 == 0) {
                names.remove(name);
            }
        }
        System.out.println(names);

        //Find Smallest Element
        System.out.println("Task13:");
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Heroes");
        songs.add("UnderPressure");
        songs.add("Ride");

        ArrayList<Integer> countSongLength = new ArrayList<>();
        int count3 = 0;
        String shortest = "";
        for (int i = 0; i < songs.size(); i++) {
            String song1 = songs.get(i);
            countSongLength.add(song1.length());
            Collections.sort(countSongLength);

            if ( song1.length() == countSongLength.get(0) ) {
                shortest = song1;
            }
        }
        System.out.println(shortest);

        //Replace All vowels
        System.out.println("Task14:");
        ArrayList<String> words = new ArrayList<>();
        words.add("shell");
        words.add("violet");
        words.add("peace");


        for (int i = 0; i < words.size(); i++) {
            char[] wordArray = new char[words.size()];
            String word = words.get(i);
            wordArray = word.toCharArray();
            for (int j = 0; j < wordArray.length; j++) {
                char[] vowels = {'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A'};
                for (int k = 0; k < vowels.length; k++) {
                    if (wordArray[j] == vowels[k]) {
                        wordArray[j] = '*';
                    }
                }
            }

            words.set(i, new String(wordArray));

        }
        System.out.println(words);

        //Partition ArrayList
        System.out.println("Task15:");
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        //Rotate Elements
        System.out.println("Task16: ");
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        ArrayList<String> newDaysOfWeek = new ArrayList<>();

        for (int i = 0; i < daysOfWeek.size(); i++) {
            int count4 = (i+2) % daysOfWeek.size();
            String day = daysOfWeek.get(count4);
            newDaysOfWeek.add(day);
        }
        System.out.println(newDaysOfWeek);

        //Remove Null Values
        System.out.println("Task17:");
        ArrayList<String> namesOfStudents = new ArrayList<>();
        namesOfStudents.add("Emma");
        namesOfStudents.add(null);
        namesOfStudents.add("David");
        namesOfStudents.add(null);
        namesOfStudents.add("Alex");

        for (int i = 0; i < namesOfStudents.size(); i++) {
            String name = namesOfStudents.get(i);
            System.out.println(name);
            if (name == null) {
                namesOfStudents.remove(i);
            }
        }
        System.out.println(namesOfStudents);

        //Find Second Largest Element
        System.out.println("Task18:");
//        This ArrayList already exists somewhere above
//        ArrayList<String> movieTitles = new ArrayList<>();
//        movieTitles.add("Soulmates");
//        movieTitles.add("SummerStrike");
//        movieTitles.add("WeakHero");

        ArrayList<Integer> lengthsOfMovies = new ArrayList<>();
        for (int i = 0; i < movieTitles.size(); i++) {
            String movie = movieTitles.get(i);
            int size = movie.length();
            lengthsOfMovies.add(size);
        }

        Collections.sort(lengthsOfMovies, Collections.reverseOrder());
        System.out.println(lengthsOfMovies.get(1));

        //Replace Elements with Length
        System.out.println("Task19:");
//        This ArrayList already exists somewhere above
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Grape");

        ArrayList<Integer> lengthOfFruits = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            int length = fruit.length();
            lengthOfFruits.add(length);
        }
        System.out.println(lengthOfFruits);

        //Create Nested ArrayList
        System.out.println("Task20:");
        ArrayList<ArrayList<String>> office = new ArrayList<>();

        ArrayList<String> department1 = new ArrayList<>();
        department1.add("employer1");
        department1.add("employer2");
        ArrayList<String> department2 = new ArrayList<>();
        department2.add("employer3");
        department2.add("employer4");
        ArrayList<String> department3 = new ArrayList<>();
        department3.add("employer5");
        department3.add("employer6");

        office.add(department1);
        office.add(department2);
        office.add(department3);

        System.out.println(office);
    }
}