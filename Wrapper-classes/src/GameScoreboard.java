public class GameScoreboard {
    public static void main(String[] args) {
        // Integer array representing scores (null = hasn't played)
        Integer[] playerScores = {1500, null, 2400, 0, null, 800};

        int inactivePlayers = 0;
        int totalScore = 0;
        int activePlayers = 0;

        for (Integer score : playerScores) {
            // 1. Check for null to identify players who haven't played
            if (score == null) {
                inactivePlayers++;
            } else {
                // 2. Auto-unboxing: Integer object is converted to int for addition
                totalScore += score;
                activePlayers++;
            }
        }

        System.out.println("--- Scoreboard Analytics ---");
        System.out.println("Total Active Players: " + activePlayers);
        System.out.println("Players who haven't played: " + inactivePlayers);
        System.out.println("Combined Team Score: " + totalScore);
    }
}
