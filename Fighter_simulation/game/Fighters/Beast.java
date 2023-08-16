package game.Fighters;

public class Beast extends UltimateFighter
{
    public Beast(String name)
    {
        super(name);
    }

    public void protection(int prot) throws FighterException
    {
        if(prot > 50)
            throw new FighterException("Ce combattant ne peut pas depasser les 50 points de protection");

        super.protection(prot);
    }

    public void miniprotecion(int mini) throws FighterException
    {
        if(mini > 20)
            throw new FighterException("Ce combattant ne peut pas depasser les 20 points de mini-protection");

        super.miniprotection(mini);
    }

    public void attack(int attackpoint) throws FighterException
    {
        if(attackpoint> 35)
            throw new FighterException("Ce combattant ne peut pas depasser les 35 points d'attaque");

        super.attack(attackpoint);
    }
}