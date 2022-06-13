package Inheritance;

public class Object extends Entity{

    private PuzzleCard puzzleCard;

    public Object (int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Object (int x, int y, PuzzleCard puzzleCard) {
        super(x,y);
        this.puzzleCard = puzzleCard;
    }

    public PuzzleCard search () {

        return puzzleCard;
     }
}
