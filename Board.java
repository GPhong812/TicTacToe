import java.util.Objects;
public class Board {

    Cell[] board = new Cell[9];

    public Board(){
        for(int i = 0; i <9; i++){
            board[i] = new Cell(CellStatus.EMPTY);
        }
    }

    public void setBoard(int pos, Cell boardStatus){
        board[pos].setCell(boardStatus);
    }

    public void drawtboard(){
        String row1 = "";
        for(int i = 0; i < 3; i++){

            if(board[i].getCell() == CellStatus.EMPTY){
//                System.out.print("[ ]");
                row1 += "[ ]";
            }
            else if(board[i].getCell() == CellStatus.X){
//                System.out.print("[X]");
                row1 += "[X]";
            }
            else if(board[i].getCell() == CellStatus.Y){
//                System.out.print("[Y]");
                row1 += "[Y]";
            }
        }
        System.out.print(row1 + "\n");
        String row2 = "";
        for(int i = 3; i < 6; i++){
            if(board[i].getCell() == CellStatus.EMPTY){
//                System.out.print("[ ]");
                row2 += "[ ]";
            }
            else if(board[i].getCell() == CellStatus.X){
//                System.out.print("[X]");
                row2 += "[X]";
            }
            else if(board[i].getCell() == CellStatus.Y){
//                System.out.print("[Y]");
                row2 += "[Y]";
            }
        }
        System.out.print(row2 + "\n");
        String row3 = "";
        for(int i = 6; i < 9; i++){
            if(board[i].getCell() == CellStatus.EMPTY){
//                System.out.print("[ ]");
                row3 += "[ ]";
            }
            else if(board[i].getCell() == CellStatus.X){
//                System.out.print("[X]");
                row3 += "[X]";
            }
            else if(board[i].getCell() == CellStatus.Y){
//                System.out.print("[Y]");
                row3 += "[Y]";
            }
        }
        System.out.print(row3 + "\n");
    }

    public boolean checkdraw(){
        for(int i = 0; i < 9; i++){
            if(board[i].getCell() == CellStatus.EMPTY) return false;
        }
        return true;
    }

    public boolean rowwin(){
        if(board[0].getCell() == board[1].getCell() && board[1].getCell() == board[2].getCell() && board[0].getCell() != CellStatus.EMPTY){
            return true;
        }

        if(board[3].getCell() == board[4].getCell() && board[4].getCell() == board[5].getCell() && board[3].getCell() != CellStatus.EMPTY){
            return true;
        }

        if(board[6].getCell() == board[7].getCell() && board[7].getCell() == board[8].getCell() && board[6].getCell() != CellStatus.EMPTY){
            return true;
        }
        return false;
    }

    public boolean cellwin(){
        if(board[0].getCell() == board[3].getCell() && board[3].getCell() == board[6].getCell() && board[0].getCell() != CellStatus.EMPTY){
            return true;
        }
        if(board[1].getCell() == board[4].getCell() && board[4].getCell() == board[7].getCell() && board[1].getCell() != CellStatus.EMPTY){
            return true;
        }
        if(board[2].getCell() == board[5].getCell() && board[5].getCell() == board[8].getCell() && board[2].getCell() != CellStatus.EMPTY){
            return true;
        }
        return false;
    }

    public boolean diagonalwin(){
        if(board[0].getCell() == board[4].getCell() && board[4].getCell() == board[8].getCell() && board[0].getCell() != CellStatus.EMPTY){
            return true;
        }
        if(board[2].getCell() == board[4].getCell() && board[4].getCell() == board[6].getCell() && board[2].getCell() != CellStatus.EMPTY){
            return true;
        }
        return false;
    }

    public boolean boardisfull(){
        for(int i = 0; i < 9; i++){
            if(board[i].getCell() == CellStatus.EMPTY) return false;
        }
        return true;
    }

    public boolean win(){
        if(rowwin() || cellwin() || diagonalwin()) return true;
        return false;
    }

    public boolean gameover(){
        if(win() || boardisfull()){
            return true;
        }
        else return true;
    }
}
