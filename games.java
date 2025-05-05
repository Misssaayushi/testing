interface playable
{
  public void play();
}
class football implements playable
{
  public void play()
  {
    System.out.println("football class");
  }
}
class volleyball implements playable
{
  public void play()
  {
    System.out.println("volleyball class");
  }
}
class basketball implements playable
{
  public void play()
  {
    System.out.println("basketball class");
  }
}
class games
{
    public static void main(String[] args)
    {
      football obj1=new football();
      basketball obj2=new basketball();
      volleyball obj3=new volleyball();

      obj1.play();
      obj2.play();
      obj3.play();
      
    }
}

