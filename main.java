interface Character
{
  public void attack();
}
interface Weapon
{
  public void use();
}
class Warrior implements Character,Weapon
{
  public void attack()
  {
    System.out.println("warrior attacks with sword");
  }
  public void use()
  {
    System.out.println("sword use to fight");
  }

}
class Mage implements Weapon,Character
{
  public void attack()
  {
    System.out.println("mage attacks with the fireball");
  }
  public void use()
  {
    System.out.println("mage uses magic stuff");
  }
}
class main
{
  public static void main(String[] args)
  {
    Warrior w=new Warrior();
    w.attack();
    w.use();
    Mage m=new Mage();
    m.attack();
    m.use();
  }
}