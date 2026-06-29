// Mage class - attacks with magical spells
public class Mage extends GameCharacter {
    private int manaPoints;

    public Mage(String characterName, int health, int attackPower, int manaPoints) {
        super(characterName, health, attackPower);
        this.manaPoints = manaPoints;
    }

    @Override
    public void performAttack() {
        System.out.println("[MAGE ATTACK] " + characterName + 
                         " casts an elemental spell!");
        System.out.println("   ╔════════════════════════════╗");
        System.out.println("   ║ 🔥 FIREBALL SPELL ATTACK   ║");
        System.out.println("   ╚════════════════════════════╝");
        System.out.println("   Damage Dealt: " + attackPower + " HP");
        System.out.println("   Mana Used: 30/100");
        System.out.println("   Effect: Medium damage with area effect");
        this.manaPoints -= 30;
        if (this.manaPoints < 0) {
            this.manaPoints = 0;
        }
    }

    public void displayInfo() {
        System.out.print("[MAGE] ");
        super.displayInfo();
        System.out.println("         Mana: " + manaPoints);
    }

    public void executeMassSpell() {
        if (manaPoints >= 50) {
            System.out.println("\n[MAGE ULTIMATE] " + characterName + 
                             " unleashes a METEOR STORM!");
            System.out.println("   Extra Damage: " + (int)(attackPower * 2) + " HP");
            System.out.println("   Mana Used: 50/100");
            System.out.println("   Hits all enemies in battle!");
            this.manaPoints -= 50;
        } else {
            System.out.println("\n[MAGE] " + characterName + 
                             " doesn't have enough mana for ultimate spell!");
        }
    }

    public int getManaPoints() {
        return manaPoints;
    }
}
