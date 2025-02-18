import java.util.Scanner;

public class Hari {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (; ;){
            int n = inp.nextInt();

            switch(n) {
                case 0:
                System.out.println("Minggu");
                break;
                case 1:
                System.out.println("Senin");
                break;
                case 2:
                System.out.println("Selasa");
                break;
                case 3:
                System.out.println("Rabu");
                break;
                case 4:
                System.out.println("Kamis");
                break;
                case 5:
                System.out.println("Jumat");
                break;
                case 6:
                System.out.println("Sabtu");
                break;
                default:
                System.out.println("Pick the exact number");
                
            }
        }
    }
}