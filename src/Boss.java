public class Boss {
    private int bossHp;
    private int bossDamage;
    private String protectionType;

    public int getBossHp() {
        return bossHp;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getProtection() {
        return protectionType;
    }

    public void setBossHp(int bossHp) {
        this.bossHp = bossHp;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setProtection(String protection) {
        this.protectionType = protection;
    }
}
