package lab6.ballandplayer;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(5,6,7);
        System.out.println(ball);
        Player player1 = new Player(1,5,6);
        Player player2 = new Player(2,10,12);
        player2.move(3,4);
        System.out.println(player1.near(ball));
        System.out.println(player2.near(ball));
        player2.kick(ball);
        player1.kick(ball);
        System.out.println(ball);
    }
}
