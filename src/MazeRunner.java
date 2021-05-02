import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.Scanner;

public class MazeRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static Maze myMap = new Maze();
    private static int step = 0;

    public static void main(String[] args) {

        welcome();
        game();
        end();

    }

    public static void welcome(){
        System.out.println("Welcome to Maze Ranner! ");
        System.out.println("Here is your current position : ");
    }

    private static void game(){

        while ((!myMap.didIWin()) && (step <= 100)){
            myMap.printMap();
            switch (userMove()){
                case 'R':
                    if (myMap.canIMoveRight()){
                        myMap.moveRight();
                        step++;
                    }
                    else {
                        handle1("R");
                    }
                    break;
                case 'L':
                    if(myMap.canIMoveLeft()){
                        myMap.moveLeft();
                        step++;
                    }
                    else {
                        handle1("L");
                    }
                    break;
                case 'U':
                    if(myMap.canIMoveUp()){
                        myMap.moveUp();
                        step++;
                    }
                    else {
                        handle1("U");
                    }
                    break;
                case 'D':
                    if(myMap.canIMoveDown()){
                        myMap.moveDown();
                        step++;
                    }
                    else {
                        handle1("D");
                    }
                    break;
                default:
                    System.out.println("Unsupported Operation");
                    break;
            }
            myMap.movesMessage(step);

        }
        if(step <= 100) {
            System.out.println("Congratulations, you made it out alive!");
            System.out.println("and you did it in " + step + " moves");
        }
    }

    public static char userMove(){

        System.out.println("Where would you like to move? (R, L, U, D)");

        char ch = scanner.next().charAt(0);
        while ((ch != 'R' ) && (ch != 'L') && (ch != 'U') && (ch != 'D')){
            System.out.println("Only the following characters can be entered:(R, L, U, D) ");
            ch = scanner.next().charAt(0);
        }
        return ch;
    }

    public static boolean navigatePit() {
        System.out.println("Watch out! There's a pit ahead, jump it?");
        char ch2 = scanner.next().charAt(0);
        if (ch2 == 'Y') {
            return true;
        } else {
            return false;
        }
    }

    private static void end() {
        scanner.close();
    }

    private static void  handle1(String str){

        if (myMap.isThereAPit(str)) {
            if (navigatePit()) {
                myMap.jumpOverPit(str);
            }
        }
        else {
            System.out.println("Sorry, you’ve hit a wall.");
        }

    }
}





