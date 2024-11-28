class Warrior extends Character {
    private double attack;

    public Warrior(String name, int level) {
        super(name, level);
        this.attack = calculateAttack();
    }

    double calculateAttack() {
        return baseAttack + 20; // ตัวอย่าง: คำนวณพลังโจมตีจาก baseAttack
    }

    // Method to increase attack when an accessory (like Gloves) is applied
    public void increaseAttack(double boost) {
        this.attack += boost;
        System.out.println(name + "'s attack increased by " + boost + " to " + attack);
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
