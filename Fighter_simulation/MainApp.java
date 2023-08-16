import game.Fighters.*;

public class MainApp
{
    public static void main(String[] args) throws Exception
    {
        Fighter player = new Fighter("JEAN");
        player.protection(8);
        player.attack(15);

        System.out.println(".");

        Beast player2 = new Beast("GANG");
        player2.protection(50);
        player2.attack(35);
        player2.miniprotection(29);

        System.out.println(".");

        UltimateFighter player3 = new UltimateFighter("INFINI");
        player3.attack(999999);
        player3.protection(999999999);
        player3.miniprotection(99999999);
        player3.spell(8982);
    }
}