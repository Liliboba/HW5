public class HW5 {
    public static void main(String[] args) {

        Boss firstBoss = new Boss();

        firstBoss.setBossHp(1000);
        firstBoss.setBossDamage(50);
        firstBoss.setProtection("Magical");

        System.out.println("Boss Health: " + firstBoss.getBossHp());
        System.out.println("Boss Damage: " + firstBoss.getBossDamage());
        System.out.println("Boss Protection Type: " + firstBoss.getProtection());
        System.out.println("-------------------------");

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHeroHp());
            System.out.println("Hero Damage: " + hero.getHeroDamage());
            System.out.println("Hero Super Ability: " + hero.getSuperAbility());
            System.out.println("-------------------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 50, "Magical");
        Hero hero2 = new Hero(400, 70);
        Hero hero3 = new Hero(500, 60, "Physical");

        Hero[] heroes = { hero1, hero2, hero3 };

        return heroes;
    }
}
