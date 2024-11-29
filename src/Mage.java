class Mage extends Character {
    private double magicPower;

    public Mage(String name, int level) {
        super(name, level);
        this.magicPower = calculateMagicPower();
    }

    double calculateMagicPower() {
        return baseAttack + 20;
    }

    public void increaseMagicPower(double boost) {
        this.magicPower += boost;
        System.out.println(name + "'s magic power increased by " + boost + " to " + magicPower);
    }

    public void attack(Character target) {
        if (!target.isDead()) {
            attackCharacter(target, this.magicPower);
        } else {
            System.out.println(target.name + " is already defeated!");
        }
    }

    @Override
    String getClassType() {
        return "Mage";
    }

    public void castSpell(String spellName) {
        System.out.println(name + " casts " + spellName + " with power " + magicPower);
    }
}
