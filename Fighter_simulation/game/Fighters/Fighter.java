package game.Fighters;

public class Fighter extends UltimateFighter
{
    public Fighter(String name)
    {
        super(name);
    }

    public void protection(int prot) throws FighterException
    {
        if(prot > 10)
            throw new FighterException("Ce combattant ne peut pas depasser les 10 points de protection");

        super.protection(prot);
        
    }

    public void attack(int attackpoint) throws FighterException
    {
        if(attackpoint> 15)
            throw new FighterException("Ce combattant ne peut pas depasser les 15 points d'attaque");

        super.attack(attackpoint);
    }
}