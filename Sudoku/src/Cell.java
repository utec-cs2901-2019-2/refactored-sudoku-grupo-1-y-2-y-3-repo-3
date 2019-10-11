public class Cell {
    public int val;
    public final boolean mutable;

    public Cell(){
        this.mutable = false;
        this.val = 0;
    }

    public Cell(boolean var1) {
        this.mutable = var1;
        this.val = 0;
    }
}
