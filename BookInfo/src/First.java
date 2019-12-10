import java.util.Scanner;

public class First {
    private int Book_Number;
    private String Book_name;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Number");
        Book_Number = sc.nextInt();
        System.out.println("Enter Book Name");
        Book_name = sc.next();
    }

    public void showData(){
        System.out.println("Book Number %d "+Book_Number);
        System.out.println("Book Name %s "+Book_name);
    }
}
