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
            // Вот тут должен ничинаться суровый алгоритм
//            for (int cell = 0; cell < GameBoard.dimentions*GameBoard.dimentions; cell++) {
//                if (cell+1<GameBoard.dimentions || cell + GameBoard.dimentions < GameBoard.dimentions*GameBoard.dimentions
//                        || board.getButton(cell+1).getBoard().getGame().getCurrentPlayer().getPlayerSign() ==
//                                board.getGame().getCurrentPlayer().getPlayerSign() || board.getButton(cell+GameBoard.dimentions).getBoard().getGame().getCurrentPlayer().getPlayerSign() ==
//                        board.getGame().getCurrentPlayer().getPlayerSign() || board.getButton(cell+1+GameBoard.dimentions).getBoard().getGame().getCurrentPlayer().getPlayerSign() ==
//                        board.getGame().getCurrentPlayer().getPlayerSign() ) {
//                            board.getButton(cell).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
//                            break;}
//                else if(cell+2<GameBoard.dimentions && cell + GameBoard.dimentions < GameBoard.dimentions*GameBoard.dimentions
//                        && board.getButton(cell+1).getBoard().getGame().getCurrentPlayer().getPlayerSign() ==
//                        board.getGame().getCurrentPlayer().getPlayerSign()) {
//                    board.getButton(cell).setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
//                    break;}
//                    if (board.checkWin()) {
//                        button.getBoard().getGame().showMessage("Победа компуктера!");
//                        board.emptyField();
//                        board.getGame().passTurn();
//
//                            }
//
//
//                        }
//
//                    }

        }
    }
}





