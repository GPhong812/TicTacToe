public class Cell {
    CellStatus cell = CellStatus.EMPTY;

    public Cell () {}
    public Cell(CellStatus cell) {
        this.cell = cell;
    }

    public CellStatus getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell.getCell();
    }

    public void setCell(CellStatus cell) {
        this.cell = cell;
    }
}
