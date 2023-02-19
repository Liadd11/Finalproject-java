import javax.swing.*;

public class Board extends JPanel {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    String player;

    int[][] board;
    int[] boardX;
    int[] boardY;
    int[] results;
    JFrame window;
    boolean flag;
    int counter;
    int boardHight = 800;
    int boardWidth = 800;
    int buttonHight = 100;
    int buttonWidth = 100;

    public Board() {
        board = new int[3][3];
        boardX = new int[600];
        boardY = new int[600];
        results = new int[9];
        player = "x"; // which player turn it is
        flag = true;
        counter = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                board[x][y] = 0;
            }
        }

      
        this.setLayout(null);
        this.setSize(boardWidth, boardHight);
       
    }

    public void main() {
        window = new JFrame();
        // creating buttons
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        // adding the buttons to screen
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);

        // putting the bounds of the buttons
        b1.setBounds(200, 150, buttonWidth, buttonHight);
        b2.setBounds(350, 150, buttonWidth, buttonHight);
        b3.setBounds(500, 150, buttonWidth, buttonHight);
        b4.setBounds(200, 350, buttonWidth, buttonHight);
        b5.setBounds(350, 350, buttonWidth, buttonHight);
        b6.setBounds(500, 350, buttonWidth, buttonHight);
        b7.setBounds(200, 550, buttonWidth, buttonHight);
        b8.setBounds(350, 550, buttonWidth, buttonHight);
        b9.setBounds(500, 550, buttonWidth, buttonHight);
        boardX[200] = 0;
        boardX[350] = 1;
        boardX[500] = 2;

        boardY[150] = 0;
        boardY[350] = 1;
        boardY[550] = 2;

        AddMouseListener(b1);
        AddMouseListener(b2);
        AddMouseListener(b3);
        AddMouseListener(b4);
        AddMouseListener(b5);
        AddMouseListener(b6);
        AddMouseListener(b7);
        AddMouseListener(b8);
        AddMouseListener(b9);

        this.setVisible(true);
    }

    public void createButton(int x, int y) {
        var button = new JButton("");

    }

    public void AddMouseListener(JButton Button) {
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseClicked(Button);
                printboard();
            }
        });
    }

    public void MouseClicked(JButton button) {
        if (button.getText() != "")
            return;

        results[8]++;

        var rec = button.getBounds();

        button.setText(player);
        if (player == "x") {
            player = "o";
            addToResults(rec.x, rec.y, 3);
        } else if (player == "o") {
            player = "x";
            addToResults(rec.x, rec.y, 4);
        }
        CheckWin();
    }

    public void addToResults(int x, int y, int value) {
        board[boardY[y]][boardX[x]] = value;
        results[boardY[y] + 1] += value;
        results[7 - boardX[x]] += value;
        if (boardX[x] + boardY[y] == 2)
            results[0] += value;
        if (boardX[x] == boardY[y])
            results[4] += value;
    }

    public void CheckWin() {
        for (int i : results) {
            if (i == 12) {
                JOptionPane.showMessageDialog(null, "player O wins🎉🎉");
                // this.dispose();
                break;

            } else if (i == 9) {
                JOptionPane.showMessageDialog(null, "player X wins🎉🎉");
                // this.dispose();
                break;

            }
            if (results[8] == 9) {
                JOptionPane.showMessageDialog(null, "no one won😢");
                // this.dispose();
                break;
            }

        }
    }

    public void printboard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println();
    }
}
/*
 * (0)
 * (0,0)(0,1)(0,2)(1)
 * (1,0)(1,1)(1,2)(2)
 * (2,0)(2,1)(2,2)(3)
 * (7) (6) (5) (4)
 * (8) counter
 */