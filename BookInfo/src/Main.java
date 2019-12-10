import java.util.Scanner;

public class Main {
    public static String n;
    static int counter = 0;
    public static void main(String[] args) {
        Third t[] = new Third[20];
        for (int i=0 ; i<20 ; i++){
            t[i] = new Third();
            t[i].getData();
            counter++;
            System.out.println("Want another input ? [yes/no]");
            Scanner sc = new Scanner(System.in);
            n = sc.next();
            if (n.equals("no")){
                break;
            }
        }
        for (int i = 0; i<counter;i++){
            t[i].showData();
        }
    }
}
