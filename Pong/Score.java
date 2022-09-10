package pong;


import java.awt.*;


public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        /*if (player1 == 1 || player2 == 1) {
            g.setFont(new Font("Ariel Black", Font.PLAIN, 60));
            g.drawString("GAME OVER", GAME_WIDTH / 2-130, GAME_HEIGHT / 2);
            return;
        }*/
        g.setColor(Color.yellow);
        //g.setFont();
        g.setFont(new Font("Ariel Black", Font.PLAIN, 60));
        g.drawLine(GAME_WIDTH / 2, GAME_HEIGHT, GAME_WIDTH / 2, 0);
        g.drawString(String.valueOf(player1/10)+ String.valueOf(player1 % 10), (GAME_WIDTH) / 2 - 85, 50);
        g.drawString(String.valueOf(player2/10)+ String.valueOf(player2 % 10), (GAME_WIDTH) / 2 + 20, 50);
    }

}
