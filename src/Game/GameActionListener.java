package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameActionListener implements ActionListener {
    private int row;
    private int cell;
    private GameButton button;

    public GameActionListener(int row, int cell, GameButton button) {
        this.row = row;
        this.cell = cell;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard board = button.getBoard();

        if (board.isTurnable(row, cell)) {
            updateByPlayer(board);

            if (board.isFull()) {
                board.getGame().showMessage("ничья");
                board.emptyField();
            } else {
                updateByAiData(board);
            }
        } else {
            board.getGame().showMessage("не корректный ход");
        }
    }

    private void updateByPlayer(GameBoard board) {
        board.updateGameField(row, cell);
        button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
        if (board.checkWin()) {
            button.getBoard().getGame().showMessage("Победа!");
            board.emptyField();
        } else {
            board.getGame().passTurn();
        }
    }

    private void updateByAiData(GameBoard board) {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(GameBoard.dimentions);
            y = random.nextInt(GameBoard.dimentions);
        } while (!board.isTurnable(x, y));
        board.updateGameField(x, y);
        int cellIndex = GameBoard.dimentions * x + y;
        board.getButton(cellIndex).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
        if (board.checkWin()) {
            button.getBoard().getGame().showMessage("Победа компуктера!");
            board.emptyField();
       } else {
            board.getGame().passTurn();
//            for (int i = 0; i < GameBoard.dimentions; i++) {
//                for (int j = 0; j < GameBoard.dimentions; j++) {
//                     if (board.isTurnable(i, j)) {
//                        if (i - 1 >= 0 && j - 1 >= 0 && board.getButton(cellIndex).getBoard().getGame().getCurrentPlayer().getPlayerSign() ==
//                                board.getGame().getCurrentPlayer().getPlayerSign()) {
//                            board.getButton(cellIndex).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
//
//                           // board.getGame().passTurn();
//
//                            }
//
//
//                        }
//
//                    }
//                }
//            }
//            ;
        }
    }
}


