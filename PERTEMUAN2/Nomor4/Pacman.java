package PERTEMUAN2.Nomor4;
import java.util.Scanner;
public class Pacman {
    int x,y;
    int width, height;

    void moveleft(){
        --x;
    }
    void moveRight(){
        ++x;
    }
    void moveUp(){
        --y;
    }
    void moveDown(){
        ++y;
    }
    void printPosition(){
        System.out.println("current possition: x " + x + " y " + y);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print(": ");
                } else if (j == 0 || j == width - 1) {
                    System.out.print(": ");
                } else {
                    if (!(i == y && j == x)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("v ");
                    }

                }
            }
            System.out.println();
        }
    }
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            boolean loop;
            Pacman pc = new Pacman();
            System.out.println("=============");
            do {
                System.out.print("Set width: ");
                int width = sc.nextInt();
                System.out.print("Set height: ");
                int height = sc.nextInt();
                if (width < 5|| height < 5) {
                    System.out.println("width dan height tidak boleh kurang dari 5");
                    loop = true;
                } else {
                    loop = false;
                    pc.width = width;
                    pc.height = height;
                    pc.x = 1;
                    pc.y = 1;
                }
            } while(loop);
    
            do {
                
                System.out.println("===============");
                System.out.print("w untuk move up\n" +
                        "a untuk move left\n" +
                        "s untuk move down\n" +
                        "d untuk move right\n" +
                        "p untuk print current possition\n" +
                        "=> ");
                char play = sc.next().charAt(0);
                switch (play) {
                    case 'w':
                        pc.moveUp();
                        break;
                    case 'a':
                        pc.moveleft();
                        break;
                    case 's':
                        pc.moveDown();
                        break;
                    case 'd':
                        pc.moveRight();
                        break;
                    case 'p':
                        pc.printPosition();
                        break;
                    default:
                        System.out.println("wrong input");
                        break;
                }
            }
             while(true);
}
} 
