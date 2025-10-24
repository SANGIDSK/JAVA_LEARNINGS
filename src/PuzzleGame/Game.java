package PuzzleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Game extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9]; //no of buttons 9
    private JPanel panel; //
    private JButton shuffleButton; //this is to shuffle the order of buttons
    private JButton solveButton; //this is used to solve the puzzle it self

    public Game(){
        super("Sliding Puzzle Game");//calls JFrame and set title as given
        panel = new JPanel();//creating JPanel
        panel.setLayout(new GridLayout(3,3,5,5));//setting gridLayouts

        for(int i=0;i<9;i++){
            buttons[i] = new JButton( i==8 ? "" : String.valueOf(i));
            buttons[i].setFont(new Font("Arial", Font.BOLD,24));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        shuffleButton = new JButton("Shuffle");
        shuffleButton.addActionListener(e -> shuffle());

        solveButton = new JButton("Solve");
        solveButton.addActionListener(e -> solve());

        add(panel, BorderLayout.CENTER);     // displays grid in the middle
        add(shuffleButton, BorderLayout.SOUTH); //displays shuffle button at bottom

        setSize(300, 350);// sets size of the panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // displays center on screen
        setVisible(true);

        shuffle(); // shuffle the buttons immediately at start
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource(); // which button was clicked
        int emptyIndex = findEmpty();             // to find the blank button?
        int clickedIndex = -1;

        for (int i = 0; i < 9; i++) {
            if (buttons[i] == clicked) {
                clickedIndex = i;
                break;
            }
        }

        if (isAdjacent(clickedIndex, emptyIndex)) {
            buttons[emptyIndex].setText(clicked.getText()); // move number into blank
            clicked.setText(""); // clicked becomes new blank
        }

        if (isSolved()) {
            JOptionPane.showMessageDialog(this, "🎉 Congratulations! You solved it.");
        }
    }

    private int findEmpty() { //to check the button is empty
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) return i;
        }
        return -1;
    }

    private boolean isAdjacent(int i, int j) {//to exchange the position of the button
        int row1 = i / 3, col1 = i % 3;
        int row2 = j / 3, col2 = j % 3;
        return (Math.abs(row1 - row2) + Math.abs(col1 - col2)) == 1;
    }

    private void shuffle() {
        List<String> labels = new ArrayList<>();
        for (int i = 1; i <= 8; i++){
            labels.add(String.valueOf(i));
        }
        labels.add(""); // blank

        Collections.shuffle(labels);

        for (int i = 0; i < 9; i++) {
            buttons[i].setText(labels.get(i));
        }
    }

    private void solve() {
        for (int i = 0; i < 8; i++) {
            buttons[i].setText(String.valueOf(i + 1));
        }
        buttons[8].setText(""); // last button blank
    }

    private boolean isSolved() {
        for (int i = 0; i < 8; i++) {
            if (!buttons[i].getText().equals(String.valueOf(i + 1))) return false;
        }
        return buttons[8].getText().equals("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Game::new);
    }
}
