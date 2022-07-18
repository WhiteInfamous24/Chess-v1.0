package srs;

public class Main {

    public static void main(String[] args) throws Exception {
        Game game = Game.getInstance();
        game.initializePieces();
        game.getUserInterface().cleanScreen();
        game.showBoard();
        game.insertVoidLine(1);
        game.showPiecesTaken();
        while (!game.thereIsCheckmate()) {
            game.insertVoidLine(2);
            game.playerTurnMessage();
            game.insertVoidLine(1);
            game.showIfThereIsCheck();
            game.movePiece();
            game.analizePawnPromotion();
            game.getUserInterface().cleanScreen();
            game.showBoard();
            game.insertVoidLine(1);
            game.showPiecesTaken();
            game.changePlayer();
        }
        game.changePlayer();
        game.getUserInterface().cleanScreen();
        game.showBoard();
        game.insertVoidLine(1);
        game.showPiecesTaken();
        game.insertVoidLine(2);
        game.winnerMessage();
        game.insertVoidLine(1);
    }
}
