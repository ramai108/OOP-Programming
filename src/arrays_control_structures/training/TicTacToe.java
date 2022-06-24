package arrays_control_structures.training;
import java.util.*;

public class TicTacToe {

    private String [][] chessboard = new String [3][3];
    private String alpha = "O";
    private String betha = "X";
    private String output = "";
    private boolean alphawin = false;
    private boolean bethawin = false;

    public boolean isAlphawin() {
        return alphawin;
    }

    public void setAlphawin(boolean alphawin) {
        this.alphawin = alphawin;
    }

    public boolean isBethawin() {
        return bethawin;
    }

    public void setBethawin(boolean bethawin) {
        this.bethawin = bethawin;
    }

    public TicTacToe () {}

    public void fillBoard(int option, int y, int x ) {
        if (option == 1)
            chessboard[y][x] = alpha;
        else
            chessboard[y][x] = betha;
    }
    public Map<Integer, List<Integer>> showEmptyCells () {
        int index = 0;
        Map<Integer,List<Integer>> empty = new HashMap<Integer,List<Integer>>();
        for (int y = 0; y < chessboard.length; y++) {
            for (int x = 0; x < chessboard[y].length; x++) {
                if (chessboard[y][x] == null) {
                    empty.put(index, Arrays.asList(y,x));
                    index++;
                }
            }
        }
        return empty;
    }

    public void showCurrentGame() {
        for (String [] row : chessboard) {
            for (String item : row ) output += item + " || ";
            output += "\n";
        }
        System.out.println(output);
    }

    private String [][] trasposed () {
        String [][] trsp = new String[3][3];
        for (int y = 0; y < chessboard.length; y++) {
            for (int x = 0; x < chessboard[y].length; x++) {
                trsp[y][x] = chessboard[x][y];
            }
        }
        return trsp;
    }

    private boolean checkrows() {
        for (String [] row : chessboard) {
            if (Arrays.stream(row).distinct().count() == 1){
                if (row[0] == null) {
                    return false;
                }

                if (row[0].equals(alpha))  {
                    setAlphawin(true);
                }
                else if (row[0].equals(betha)) {
                    setBethawin(true);
                }
                return true;
            }
        }
        return false;
    }

    private boolean checkrows(String [][] m) {
        for (String [] row : m) {
            if (Arrays.stream(row).distinct().count() == 1){

                if (row[0] == null) {
                    return false;
                }

                if (row[0].equals(alpha))  {
                    setAlphawin(true);
                }
                else if (row[0].equals(betha)) {
                    setBethawin(true);
                }
                return true;
            }
        }
        return false;
    }

    private boolean checkcolumns () {
        String [][] matrix = trasposed();
        return checkrows(matrix);
    }
    private boolean checkfirstdiag() {
        String [] a = {chessboard[0][0],chessboard[1][1],chessboard[2][2]};
        return Arrays.stream(a).distinct().count() == 1;
    }
    private boolean checkseconddiag() {
        String [] b = {chessboard[0][2],chessboard[1][1],chessboard[2][0]};
        return Arrays.stream(b).distinct().count() == 1;
    }
    public boolean isfull () {
        for (int y = 0; y < chessboard.length; y++) {
            for (int x = 0; x < chessboard[y].length; x++) {
                if (chessboard[y][x] == null)
                    return false;
            }
        }
        return true;
    }
    public boolean winner () {
        if (checkrows() || checkcolumns() || checkfirstdiag() || checkseconddiag())
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicTacToe tao = new TicTacToe();
        int symbol, cell;

        System.out.println("Hi, its time to get started");

        while (!(tao.isfull() &&(tao.winner()))) {
            System.out.println("Press 1 or 2 in order to play with either O or X");
            symbol = sc.nextInt();
            System.out.println();

            System.out.println("Now choose one among the available cells");
            System.out.println(tao.showEmptyCells());
            cell = sc.nextInt();
            System.out.println();

            int y = tao.showEmptyCells().get(cell).get(0);
            int x = tao.showEmptyCells().get(cell).get(1);
            tao.fillBoard(symbol,y,x);
            tao.showCurrentGame();
        }
    }
}
