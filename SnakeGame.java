import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;


public class SnakeGame extends JFrame implements ActionListener, KeyListener {
    private static final int GRID_SIZE = 25;
    private static final int CELL_SIZE = 25;
    private static final int GAME_SPEED = 100; // Milliseconds

    private LinkedList<Point> snake;
    private Point food;
    private int direction; // 0: Up, 1: Right, 2: Down, 3: Left
    private boolean running;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        snake = new LinkedList<>();
        snake.add(new Point(5, 5));
        direction = 1; // Start moving to the right
        running = true;

        spawnFood();

        Timer timer = new Timer(GAME_SPEED, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    public void spawnFood() {
        int x = (int) (Math.random() * GRID_SIZE);
        int y = (int) (Math.random() * GRID_SIZE);
        food = new Point(x, y);
    }

    public void move() {
        Point head = snake.getFirst();
        Point newHead;

        switch (direction) {
            case 0: // Up
                newHead = new Point(head.x, (head.y - 1 + GRID_SIZE) % GRID_SIZE);
                break;
            case 1: // Right
                newHead = new Point((head.x + 1) % GRID_SIZE, head.y);
                break;
            case 2: // Down
                newHead = new Point(head.x, (head.y + 1) % GRID_SIZE);
                break;
            case 3: // Left
                newHead = new Point((head.x - 1 + GRID_SIZE) % GRID_SIZE, head.y);
                break;
            default:
                return;
        }

        if (newHead.equals(food)) {
            snake.addFirst(food);
            spawnFood();
        } else {
            snake.addFirst(newHead);
            snake.removeLast();
        }
    }

    public void checkCollision() {
        Point head = snake.getFirst();

        // Check collision with walls
        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            running = false;
        }

        // Check collision with itself
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                break;
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        // Draw snake
        g.setColor(Color.GREEN);
        for (Point point : snake) {
            g.fillRect(point.x * CELL_SIZE, point.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }

        // Draw food
        g.setColor(Color.RED);
        g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);

        if (!running) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over", getWidth() / 2 - 100, getHeight() / 2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_UP:
                if (direction != 2) direction = 0;
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 3) direction = 1;
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 0) direction = 2;
                break;
            case KeyEvent.VK_LEFT:
                if (direction != 1) direction = 3;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}


