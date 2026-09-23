import java.util.Arrays;

public class Problem10 {
    static String draftAndRank(
        Player[] players
    ) {
        Player[] draftable =
            new Player[players.length];

        int count = 0;

        for (Player player : players) {
            if (
                Player.isDraftable(
                    player.getMatchesPlayed()
                )
                ||
                Player.isDraftable(
                    player.getMatchesPlayed(),
                    player.isInjured()
                )
            ) {
                draftable[count] = player;
                count++;
            }
        }

        Player[] result =
            Arrays.copyOf(draftable, count);

        Arrays.sort(result);

        StringBuilder output =
            new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            output.append(i + 1)
                  .append(". ")
                  .append(result[i].getName());

            if (i < result.length - 1) {
                output.append(" | ");
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(
            draftAndRank(players)
        );
    }
}
