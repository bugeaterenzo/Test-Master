package Java_Assignments_October.Operators;

public class Compound_Operators {

    public static void main(String[] args) {
        // Initial total points
        int totalPoints = 50;

        // Player scores 10 more points
        totalPoints += 10; // This is equivalent to totalPoints = totalPoints + 10;

        // Player loses 5 points in a penalty
        totalPoints -= 5;  // This is equivalent to totalPoints = totalPoints - 5;

        // Print the updated total points
        System.out.println("Total Points: " + totalPoints);
    }

}
