class Warrior extends Character {
    double attack;

    public Warrior(String name, int level) {
        super(name, level);
        this.attack = calculateAttack();
    }

    double calculateAttack() {
        return baseAttack + 20;
    }

    public void increaseAttack(double boost) {
        this.attack += boost;
        System.out.println(name + "'s attack increased by " + boost + " to " + attack);
    }

    public void attack(Character target) {
        if (!target.isDead()) {
            attackCharacter(target, this.attack);
        } else {
            System.out.println(target.name + " is already defeated!");
        }
    }

    @Override
    protected String getClassType() {
        return "Warrior";
    }

    public void attack() {
        System.out.println(name + " attacks with power " + attack);
    }

    public void block() {
        System.out.println(name + " blocks an attack!");
    }
}
