package ss10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class TennisGameTest {

    public static final String PLAYER_1_NAME = "John";
    public static final String PLAYER_2_NAME = "Bill";
    private final int player1Score;
    private final int player2Score;
    private final String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
                {0, 0, "Love-All"},
                {1, 1, "Fifteen-All"},
                {2, 2, "Thirty-All"},
                {3, 3, "Forty-All"},
                {4, 4, "Deuce"},
                {1, 0, "Fifteen-Love"},
                {0, 1, "Love-Fifteen"},
                {2, 0, "Thirty-Love"},
                {0, 2, "Love-Thirty"},
                {3, 0, "Forty-Love"},
                {0, 3, "Love-Forty"},
                {4, 0, "Win for John"},
                {0, 4, "Win for Bill"},
                {2, 1, "Thirty-Fifteen"},
                {1, 2, "Fifteen-Thirty"},
                {3, 1, "Forty-Fifteen"},
                {1, 3, "Fifteen-Forty"},
                {4, 1, "Win for John"},
                {1, 4, "Win for Bill"},
                {3, 2, "Forty-Thirty"},
                {2, 3, "Thirty-Forty"},
                {4, 2, "Win for John"},
                {2, 4, "Win for Bill"},
                {4, 3, "Advantage John"},
                {3, 4, "Advantage Bill"},
                {5, 4, "Advantage John"},
                {4, 5, "Advantage Bill"},
                {15, 14, "Advantage John"},
                {14, 15, "Advantage Bill"},
                {6, 4, "Win for John"},
                {4, 6, "Win for Bill"},
                {16, 14, "Win for John"},
                {14, 16, "Win for Bill"},
        });
    }

    @Test
    public void checkAllScores() {
        assertEquals(expectedScore, TennisGame.getScore(PLAYER_1_NAME, PLAYER_2_NAME, player1Score, player2Score));
    }
}
