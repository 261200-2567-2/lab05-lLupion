abstract class Character implements RPGCharacter {
    String name;
    int level;
    double HP;
    double baseAttack;
    double baseDefense;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.HP = calculateMaxHP();
        this.baseAttack = calculateBaseATK();
        this.baseDefense = calculateBaseDEF();
    }

    double calculateMaxHP() {
        return 100 + 10 * level;
    }

    double calculateBaseATK() {
        return 50 + 5 * level;
    }

    double calculateBaseDEF() {
        return 50 + 2 * level;
    }

    abstract String getClassType();

    @Override
    public void equipAccessory(Accessory accessory) {
        System.out.println(name + " equipped " + accessory.getName());
        accessory.applyEffect(this);
    }

    @Override
    public void getStats() {
        System.out.println("CLASS: " + getClassType());
        System.out.println("Name: " + name + ", Level: " + level);
        System.out.println("HP: " + HP + ", Base Attack: " + baseAttack + ", Base Defense: " + baseDefense);
    }
}