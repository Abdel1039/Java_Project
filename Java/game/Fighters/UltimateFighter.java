package game.Fighters;

public class UltimateFighter
{
    //Nom
    public UltimateFighter(String name)
    {

        this.mName = name;
        System.out.println("Le nom du combatant est "+name);

        this.mHeal = 20;
        System.out.println("Vous avez "+this.mHeal+" de point de vie");
    }

    //Point de Protection
    public void protection(int prot) throws FighterException
    {
        this.mProtection = prot;
        System.out.println("Votre protection est de " + this.mProtection);
    }
    
    //Point d'attaque
    public void attack(int attackpoint) throws FighterException
    {
        this.mAttack = attackpoint;
        System.out.println("Vous avez fait "+this.mAttack+" de point d'attaque");
    }

    //Point de Mini-Protection
    public void miniprotection(int mini) throws FighterException
    {
        this.mMiniprotection = mini;
        System.out.println("Votre miniprotecion est de "+this.mMiniprotection);
    }

    //Point de sort
    public void spell(int spe)
    {
        this.mSpell = spe;
        System.out.println("Vous avez lancez "+spe+" sort sur l'ennemie");
    }

    
    protected String mName;
    protected final int mHeal;
    protected int mProtection;
    protected int mAttack;
    protected int mMiniprotection;
    protected int mSpell;
}