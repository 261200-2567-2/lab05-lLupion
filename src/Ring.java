class Ring implements Accessory {
    String name;
    String description;
    double magicBoost;

    public Ring(String name, String description, double magicBoost) {
        this.name = name;
        this.description = description;
        this.magicBoost = magicBoost;
    }

    @Override
    public void applyEffect(Character character) {
        if (character instanceof Mage) {
            ((Mage) character).increaseMagicPower(magicBoost);
        } else {
            System.out.println("The ring has no effect on " + character.name);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}