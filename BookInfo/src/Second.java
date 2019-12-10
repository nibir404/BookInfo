import java.util.Scanner;

public class Second extends First {
    String Author_name;
    String Publisher;

    @Override
    public void getData() {
        super.getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Author Name : ");
        Author_name = in.next();
        System.out.println("Enter Publisher Name : ");
        Publisher = in.next();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Author Name : %s "+Author_name);
        System.out.println("Publisher : %s "+Publisher);
    }
}
