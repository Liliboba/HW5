public class Hero {
    private int heroHp;
    private int heroDamage;
    private String superAbility;

    public Hero(int heroHp, int heroDamage, String superAbility) {
        this.heroHp = heroHp;
        this.heroDamage = heroDamage;
        this.superAbility = superAbility;

    }

    public Hero(int heroHp, int heroDamage) {
        this.heroHp = heroHp;
        this.heroDamage = heroDamage;
        this.superAbility = "None";
    }

    public int getHeroHp() {
        return heroHp;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

}
