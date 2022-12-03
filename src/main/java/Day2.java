
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader text = new BufferedReader(new FileReader("inputs/day2.txt"));
        String testInput = """
                A X
                B Y
                B Z
                           """;
        String line = "";
        Integer myPoints = 0;
        Integer theirPoints = 0;
        Map<String, Integer> pointsMap = new HashMap<>();
        pointsMap.put("A", 1);
        pointsMap.put("X", 1);
        pointsMap.put("B", 2);
        pointsMap.put("Y", 2);
        pointsMap.put("C", 3);
        pointsMap.put("Z", 3);
        Scanner sc = new Scanner(text);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] temp = line.split("\s");
            Integer myTile = pointsMap.get(temp[1]);
            Integer theirTile = pointsMap.get(temp[0]);
            switch (myTile) {
                case 1: //rock
//                    if (theirTile == 1) {
//                        theirPoints += theirTile + 3;
//                        myPoints += myTile + 3;
//                        myPoints += theirTile;
//                    } else if (theirTile == 2) {
//                        theirPoints += theirTile + 6;
//                        myPoints += myTile;
//                    } else if (theirTile == 3) {
//                        myPoints += myTile + 6;
//                        theirPoints += theirTile;
//                    }
                    if (theirTile == 1) {
                        myPoints += 3;
                    } else if (theirTile == 2) {
                        myPoints += 1;
                    } else if (theirTile == 3) {
                        myPoints += 2;
                    }
                    break;
                case 2: //paper
//                    if (theirTile == 2) {
//                        theirPoints += theirTile + 3;
//                        myPoints += myTile + 3;
//                    } else if (theirTile == 3) {
//                        theirPoints += theirTile + 6;
//                        myPoints += myTile;
//                    } else if (theirTile == 1) {
//                        myPoints += myTile + 6;
//                        theirPoints += theirTile;
//                    }
                    myPoints += theirTile + 3;
                    break;
                case 3: //scissors
//                    if (theirTile == 3) {
//                        theirPoints += theirTile + 3;
//                        myPoints += myTile + 3;
//                    } else if (theirTile == 1) {
//                        theirPoints += theirTile + 6;
//                        myPoints += myTile;
//                    } else if (theirTile == 2) {
//                        myPoints += myTile + 6;
//                        theirPoints += theirTile;
//                    }
                    if (theirTile == 1) {
                        myPoints += 2 + 6;
                    } else if (theirTile == 2) {
                        myPoints += 3 + 6;
                    } else if (theirTile == 3) {
                        myPoints += 1 + 6;
                    }
                    break;
            }
            System.out.println("My points: " + myPoints);
            System.out.println("Their points: " + theirPoints);

        }
        System.out.println("My points totals: " + myPoints);
        System.out.println("Their points totals: " + theirPoints);
    }
}
