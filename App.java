public class App
{
  public static void main(String[] args)
  {
    System.out.println("Test 1: Green dragon spotted ahead!");
    DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
    dragonSlayer.goToBattle();
    
    System.out.println("\nTest 2: Red dragon emerges.");
    dragonSlayer.changeStrategy(new ProjectileStrategy());
    dragonSlayer.goToBattle();
    
    System.out.println("\nTest 3: Black dragon lands before you.");
    dragonSlayer.changeStrategy(new SpellStrategy());
    dragonSlayer.goToBattle();
  }
}
