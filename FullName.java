import java.util.Scanner;

public class FullName {

  void display()
  {
    String s1,s2,s3;
    Scanner s=new Scanner(System.in);
    System.out.println("enter your first name , middle name and last name ");
    s1=s.next();
    s2=s.next();
    s3=s.next();

    System.out.println(s1.toUpperCase().charAt(0)+"."+s2.toUpperCase().charAt(0)+s3);

  }
  public static void main(String[] args)
  {
    FullName obj=new FullName();
    obj.display();
  }
}
