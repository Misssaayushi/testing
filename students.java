import java.util.Scanner;


class students
{
  Scanner s=new Scanner(System.in);

  String name[]=new String[5];

  void input()
  {
    System.out.print("enter how many students=");
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
      
        System.out.print("enter name of "+(i+1)+" student=");
        name[i]=s.next();
      
        System.out.println("please enter correct name =");

      boolean allMarks50=true;

      for(int j=1;j<=3;j++)
      {
        System.out.print("enter your marks in subject "+j+"=");
        int marks=s.nextInt();

        if(marks<50)
        {
          allMarks50=false;
        }
      }
      System.out.print("grade of student "+name[i]+" = ");
      if(allMarks50)
      {
        System.out.println("A");
      }
      else{
        System.out.println("F");
      }
      s.nextLine();
    }
  }
  public static void main(String[] args) {
    students obj=new students();
    obj.input();
  }
}