package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JFrame {
    static int dimentions = 3;
    static int cellSize = 150;
    private char[][] gameField;
    private GameButton[] gameButtons;
    private static char nullSymbol = '\u0000';
    private Game game;

    public GameBoard(Game currentGame){
        this.game = currentGame;
        initField();
    }
        private void initField(){
        setBounds(cellSize*dimentions,cellSize*dimentions,400,300);
        setTitle("Крестики-нолики");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        JPanel controlPanel = new JPanel();
        JButton newGame = new JButton("Новая игра");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyField();

            }
        });
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGame);
        controlPanel.setSize(cellSize*dimentions,150);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(dimentions,dimentions));
        gamePanel.setSize(cellSize*dimentions,cellSize*dimentions);

        gameField = new char[dimentions][dimentions];
        gameButtons = new GameButton[dimentions*dimentions];

        for (int i = 0; i < (dimentions*dimentions);i++){
            GameButton fieldButon = new GameButton(i,this);
            gamePanel.add(fieldButon);
            gameButtons[i] = fieldButon;
        }
        getContentPane().add(controlPanel,BorderLayout.NORTH);
        getContentPane().add(gamePanel,BorderLayout.CENTER);
        setVisible(true);
        }

        void emptyField(){
        for (int i = 0; i < (dimentions*dimentions); i++){
            gameButtons[i].setText("");
            int x = i / GameBoard.dimentions;
            int y = i % GameBoard.dimentions;
            gameField[x][y] = nullSymbol;
        }
    }

    Game getGame(){
        return game;
    }

    boolean isTurnable(int x, int y){
        boolean rezult = false;
        if (gameField[x][y] == nullSymbol)
            rezult = true;
            return rezult;
    }
    void updateGameField(int x, int y){
        gameField[x][y] = game.getCurrentPlayer().getPlayerSign();
    }
    boolean checkWin(){
        boolean rezult = false;
        char playerSymbol = getGame().getCurrentPlayer().getPlayerSign();
        if(checkDiag(playerSymbol)||checkWinLines(playerSymbol) ){
            rezult = true;
        }return rezult;
    }
    private boolean checkDiag(char playerSymbol){
        boolean result = false;
        int diag = 0;
        int giag = 0;
        for (int i = 0; i < dimentions; i++) {

                if (gameField[i][i] == playerSymbol) {
                    diag++;
                 }
                    if (diag == dimentions) {
                        result = true;
                    }
                 else if((gameField[dimentions-1-i][i] == playerSymbol))
                    giag++;
                    if (giag == dimentions) {
                        result = true;

            }
        }
        return result;
    }
    private boolean checkWinLines(char playerSymbol){
        boolean cols, rows, rezult;
        rezult = false;
        for (int col = 0; col < dimentions; col++){
            cols = true;
            rows = true;
            for(int row = 0; row < dimentions; row++){
                cols &=(gameField[col][row] == playerSymbol);
                rows &=(gameField[row][col] == playerSymbol);
            }
            if (cols || rows){
                rezult = true;
                return rezult;
            }
            if(rezult){
                break;
            }
        }return rezult;
    }
    boolean isFull(){
        boolean rezult = true;
        for (int i = 0; i < dimentions; i++){
            for(int j = 0; j< dimentions; j++){
                if (gameField[i][j] == nullSymbol)
                    rezult =false;
            }
        }return rezult;
    }
    public GameButton getButton(int buttonIndex){
        return gameButtons[buttonIndex];
    }



}
