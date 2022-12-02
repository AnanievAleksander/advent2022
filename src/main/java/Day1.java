import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader text = new BufferedReader(new FileReader("inputs/day1.txt"));
        String testInput = """
                1000
                2000
                3000
                                        
                4000
                                        
                5000
                6000
                                        
                7000
                8000
                9000
                                        
                10000
                            """;

        int calories = 0;
        int maxCalories = 0;

        Scanner sc = new Scanner(text);
        String line = "";
        List<Integer> maxCaloriesList = new ArrayList<>();
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.isBlank()) {
                maxCaloriesList.add(calories);
                if (maxCalories < calories) {
                    maxCalories = calories;
                }
                calories = 0;
                continue;
            }

            calories += Integer.parseInt(line);
        }
        maxCaloriesList.add(calories);
        Collections.sort(maxCaloriesList);
        Collections.reverse(maxCaloriesList);
        System.out.println(maxCaloriesList);
        System.out.println(maxCalories);
        Integer threeElfsCalories = 0;
        for (int i = 0; i < 3; i++) {
            threeElfsCalories += maxCaloriesList.get(i);
        }
        System.out.println(threeElfsCalories);
    }

}
