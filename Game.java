import java.util.Scanner;

public class Game {
    static boolean checking ( int position, Board newBoard){
        if (position < 0 || position > 8) {
            return false;
        }
        if (newBoard.board[position].getCell() != CellStatus.EMPTY) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean isXTurn = true;
        Board newBoard = new Board();

        while (!newBoard.checkdraw()) {
            if (isXTurn) {
                System.out.println("X Turn");
            } else {
                System.out.println("Y Turn");
            }

            Scanner scanner = new Scanner((System.in));
            int pos = scanner.nextInt();

//        static boolean checking ( int position, Board newBoard){
//            if (position < 0 || position > 8) {
//                return false;
//            }
//            if (newBoard.board[position].getCell() != CellStatus.EMPTY) {
//                return false;
//            }
//            return true;
//        }

            while (!checking(pos, newBoard)) {
                System.out.println("Invalid, try again !");
                pos = scanner.nextInt();
            }
            if (isXTurn) {
                newBoard.setBoard(pos, new Cell(CellStatus.X));
                newBoard.drawtboard();
                if (newBoard.win()) {
                    System.out.println("X Win");
                    break;
                } else if (newBoard.boardisfull()) {
                    System.out.println("Tie");
                    break;
                }
            } else {
                newBoard.setBoard(pos, new Cell(CellStatus.Y));
                newBoard.drawtboard();
                if (newBoard.win()) {
                    System.out.println("Y Win");
                    break;
                }
            }
            isXTurn = !isXTurn;
        }
        if (!newBoard.gameover()) System.out.println("Draw");
    }
}
