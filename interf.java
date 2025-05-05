interface A
{
  default void a()
  {
    System.out.println("class A");
  }
  
}
interface B extends A
{
 default void b()
  {
    System.out.println("class B");
  }
}
interface C extends B
{
  default void c()
  {
    System.out.println("class C");
  }
}
interface D extends B,C
{
 default void d()
  {
    System.out.println("class D");
  }
}
class basic implements D
{

}
public class interf {
      public static void main(String[] args)  
      {
        basic obj=new basic();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
      }
}
