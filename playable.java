interface playable
{
  void play();
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
  
}

// class playable
// {
//   public static void main(String[] args)
//   {

//   }
// }