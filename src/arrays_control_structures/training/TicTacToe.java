package arrays_control_structures.training;
import java.util.*;

public class TicTacToe {

    private String [][] chessboard = new String [3][3];
    private final String alpha = "O";
    private final String betha = "X";
    private String output = "";
    public TicTacToe () {}

    public void fillBoard(Integer option, Integer y, Integer x ) {
        if (option == 1) chessboard[y][x] = alpha;
        else chessboard[y][x] = betha;
    }
    public Map<Integer, List<Integer>> showEmptyCells () {
        int index = 0;
        Map<Integer,List<Integer>> empty = new HashMap<Integer,List<Integer>>();
        for (int y = 0; y < chessboard.length; y++) {
            for (int x = 0; x < chessboard[y].length; x++) {
                if (chessboard[y][x] != null) {
                    empty.put(index, Arrays.asList(y,x));
                }
            }
        }
        return empty;
    }

    public void showCurrentGame() {
        for (String [] row : chessboard) {
            for (String item : row ) {
                output += item + " || ";
            }
            output += "\n";
        }
        System.out.println(output);
    }

    public String getAlpha() { return alpha; }
    public String getBetha() { return betha; }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicTacToe tao = new TicTacToe();
        int input;
        Integer in;
        System.out.println("Hi, its time to get started");
        System.out.println("Press 1 or 2 in order to play with either O or X");
        input = sc.nextInt();
        System.out.println("Now choose one among the available cells");
        System.out.println(tao.showEmptyCells());
        if (input == 1) {
            tao.fillBoard(1,0,0);
        }

        tao.showCurrentGame();

    }
}
