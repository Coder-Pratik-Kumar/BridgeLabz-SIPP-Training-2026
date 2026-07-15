import java.util.Scanner;
public class RPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[games][4];
        int playerWins = 0;
        int compWins = 0;
        int draws = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String player = sc.nextLine().trim().toLowerCase();
            String computer = getComputerChoice();
            String winner = determineWinner(player, computer);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            } else {
                draws++;
            }
            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = player;
            gameResults[i][2] = computer;
            gameResults[i][3] = winner;
        }

        displayGameResults(gameResults);
        displayStats(games, playerWins, compWins, draws);
        sc.close();
    }

    public static String getComputerChoice() {
        double value = Math.random();
        if (value < 1.0 / 3.0) {
            return "rock";
        }
        if (value < 2.0 / 3.0) {
            return "paper";
        }
        return "scissors";
    }

    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static void displayGameResults(String[][] results) {
        System.out.printf("%-6s %-10s %-10s %-10s%n", "Game", "Player", "Computer", "Winner");
        for (String[] row : results) {
            System.out.printf("%-6s %-10s %-10s %-10s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void displayStats(int games, int playerWins, int compWins, int draws) {
        double playerPct = games == 0 ? 0 : (playerWins * 100.0) / games;
        double compPct = games == 0 ? 0 : (compWins * 100.0) / games;
        System.out.println("\nGame stats:");
        System.out.printf("%-20s %-10s%n", "Stat", "Value");
        System.out.printf("%-20s %-10d%n", "Player wins", playerWins);
        System.out.printf("%-20s %-10d%n", "Computer wins", compWins);
        System.out.printf("%-20s %-10d%n", "Draws", draws);
        System.out.printf("%-20s %-10.2f%%%n", "Player win %", playerPct);
        System.out.printf("%-20s %-10.2f%%%n", "Computer win %", compPct);
    }
}
