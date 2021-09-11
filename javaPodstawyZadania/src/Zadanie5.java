import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        String[][] gameBoard = new String[3][3];
        Scanner input = new Scanner(System.in);
        String gameState = input.nextLine();
        String line ;
        int counter = 0;
        //System.out.println(gameState.substring(0,3));
        //czytanie ciagu ze stanemg gry
        for(int i=0; i<3;i++){
            counter +=3;
            line = gameState.substring(counter-3,counter);
            for (int j=0;j<3;j++){
                gameBoard[i][j] = String.format("%s",line.charAt(j));
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean checkVertical(String[][] gameBoard, String player){
        boolean isWin = false;

        for (int i = 0 ; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(gameBoard[j][i]);
                if(!gameBoard[j][i].contains(player)){
                    isWin = false;
                    continue;
                }
                else{
                    isWin = true;
                }
            }
            if(isWin){
                return isWin;
            }
        }
        return isWin;
    }

    private static boolean checkHorizontal(String[][] gameBoard, String player) {
        boolean isWin = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(gameBoard[i][j]);
                if (!gameBoard[i][j].contains(player)) {
                    isWin = false;
                    continue;
                } else {
                    isWin = true;
                }
            }
            if (isWin) {
                return isWin;
                // break;
            }
        }
        return isWin;
    }

}
