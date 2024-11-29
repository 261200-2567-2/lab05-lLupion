public class Lab05 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Apple", 5);
        Mage mage = new Mage("Banana", 10);

        Accessory magicRing = new Ring("Magic Ring", "A ring that boosts magic power", 20);
        Accessory combatGloves = new Gloves("Combat Gloves", "Gloves that boost attack power", 15);

        warrior.getStats();
        warrior.attack();
        warrior.equipAccessory(magicRing);
        warrior.equipAccessory(combatGloves);
        warrior.attack();

        System.out.println();

        System.out.println("[ Battle ]");
        warrior.attack(mage);
        mage.attack(warrior);
        warrior.attack(mage);

        System.out.println();

        mage.getStats();
        mage.castSpell("Fireball");
        mage.equipAccessory(magicRing);
        mage.equipAccessory(combatGloves);
        mage.castSpell("Fireball");
    }
}