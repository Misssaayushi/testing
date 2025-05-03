import java.util.*;

interface Account
{
  void deposit(double dep);
  void withdraw(double with);
  void balance();
}

class SavingAccount implements Account
{
    double dep,with,balc;
    public void deposit(double dep)
    {
      this.dep=dep;
      System.out.println(dep+" is succesfully deposited!!!");
    }
    public void withdraw(double with)
    {
      this.with=with;
      if(with>dep)
      {
        System.out.println("insufficient amount!!!");
      }
      else
      {
        System.out.println(with+" is successfully withdrawed!!!");
      }
      
    }
    public void balance()
    {
      System.out.println("your total balance ="+(dep-with));
    }

}
class currentAcc implements Account
{
  double dep,with,balc;
  public void deposit(double dep)
  {
    this.dep=dep;
    System.out.println(dep+" is succesfully deposited!!!");
  }
  public void withdraw(double with)
  {
    this.with=with;
    if(with>dep)
    {
      System.out.println("insufficient amount!!!");
    }
    else
    {
      System.out.println(with+" is successfully withdrawed!!!");
    }
    
  }
  public void balance()
  {
    System.out.println("your total balance ="+(dep-with));
  }
}

public class BankingSystem {

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double dep,with;
    
    SavingAccount s=new SavingAccount();
    currentAcc c=new currentAcc();

    int choice;
    System.out.println("press 1 for saving account");
    System.out.println("press 2 for current account");
    System.out.print("enter your choice=");
    choice=sc.nextInt();

    switch(choice)
    {
      case 1:System.out.print("do you want to deposite?y/n:");
            String yesNo=sc.next();
            if(yesNo.equals("y"))
            {
              System.out.print("enter how much you want to deposit:");
              dep=sc.nextInt();
              s.deposit(dep);
            }
            System.out.print("do you want to withdraw?y/n:");
            yesNo=sc.next();
            if(yesNo.equals("y"))
            {
              System.out.print("enter how much you want to withdraw:");
              with=sc.nextInt();
              s.withdraw(with);
            }
            System.out.print("do you want to check your balance ?y/n:");
            yesNo=sc.next();
            if(yesNo.equals("y"))
            {    
              s.balance();
            }  
            break;    
         case 2: System.out.print("do you want to deposite?y/n:");
            String yesNoCurr=sc.next();
            if(yesNoCurr.equals("y"))
            {
              System.out.print("enter how much you want to deposit:");
              dep=sc.nextInt();
              c.deposit(dep);
            }
            System.out.print("do you want to withdraw?y/n:");
            yesNoCurr=sc.next();
            if(yesNoCurr.equals("y"))
            {
              System.out.print("enter how much you want to withdraw:");
              with=sc.nextInt();
              c.withdraw(with);
            }
            System.out.print("do you want to check your balance ?y/n:");
            yesNoCurr=sc.next();
            if(yesNoCurr.equals("y"))
            {    
              c.balance();
            } 
            break;
         default:
              System.exit(0);       
    }

  }
    
} 
