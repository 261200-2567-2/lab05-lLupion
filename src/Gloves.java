class Gloves implements Accessory {
    String name;
    String description;
    double attackBoost;

    public Gloves(String name, String description, double attackBoost) {
        this.name = name;
        this.description = description;
        this.attackBoost = attackBoost;
    }

    @Override
    public void applyEffect(Character character) {
        if (character instanceof Warrior) {
            ((Warrior) character).increaseAttack(attackBoost);
        } else {
            System.out.println("The gloves have no effect on " + character.name);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}