class Mage extends Character {
    private double magicPower;

    public Mage(String name, int level) {
        super(name, level);
        this.magicPower = calculateMagicPower();
    }

    double calculateMagicPower() {
        return baseAttack + 20; // Example: Magic Power derived from baseAttack
    }

    // Method to increase magic power when an accessory (like a Ring) is applied
    public void increaseMagicPower(double boost) {
        this.magicPower += boost;
        System.out.println(name + "'s magic power increased by " + boost + " to " + magicPower);
    }

    @Override
    String getClassType() {
        return "Mage";
    }

    public void castSpell(String spellName) {
        System.out.println(name + " casts " + spellName + " with power " + magicPower);
    }
}
