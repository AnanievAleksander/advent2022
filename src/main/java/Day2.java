
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        String testInput = """
                A Y
                B X
                C Z
                           """;
        String line = "";
        Integer myPoints = 0;
        Integer theirPoints = 0;
        Map<String, String> pointsMap = new HashMap<>();
        pointsMap.put("A", "rock");
        pointsMap.put("Y", "rock");
        pointsMap.put("B", "paper");
        pointsMap.put("X", "paper");
        pointsMap.put("C", "scissors");
        pointsMap.put("Z", "scissors");
        Scanner sc = new Scanner(testInput);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
            String[] temp = line.split("\s");
            System.out.println(Arrays.asList(temp));
            String myTile = pointsMap.get(temp[0]);
            String theirTile = pointsMap.get(temp[1]);
            System.out.println("My tile: " + myTile + " : " + "Their tile: " + theirTile);
            switch (myTile) {
                case "rock":
                    if (theirTile.matches("rock")) {
                        theirPoints += 1;
                        myPoints += 1;
                    } else if (theirTile.matches("paper")) {
                        theirPoints += 2;
                    } else if (theirTile.matches("scissors")) {
                        myPoints += 2;
                    }
                    break;
                case "paper":
                    if (theirTile.matches("paper")) {
                        theirPoints += 1;
                        myPoints += 1;
                    } else if (theirTile.matches("scissors")) {
                        theirPoints += 2;
                    } else if (theirTile.matches("rock")) {
                        myPoints += 2;
                    }
                    break;
                case "scissors":
                    if (theirTile.matches("scissors")) {
                        theirPoints += 1;
                        myPoints += 1;
                    } else if (theirTile.matches("rock")) {
                        theirPoints += 2;
                    } else if (theirTile.matches("paper")) {
                        myPoints += 2;
                    }
                    break;
            }

        }
        System.out.println("My points: " + myPoints);
        System.out.println("Their points: " + theirPoints);
    }
}
