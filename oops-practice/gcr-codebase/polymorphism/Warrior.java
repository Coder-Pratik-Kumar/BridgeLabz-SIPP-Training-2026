// Warrior class - attacks with heavy melee damage
public class Warrior extends GameCharacter {

    public Warrior(String characterName, int health, int attackPower) {
        super(characterName, health, attackPower);
    }

    @Override
    public void performAttack() {
        System.out.println("[WARRIOR ATTACK] " + characterName + 
                         " swings a massive sword with tremendous force!");
        System.out.println("   ╔════════════════════════════╗");
        System.out.println("   ║ ⚔️  MELEE STRIKE ATTACK   ║");
        System.out.println("   ╚════════════════════════════╝");
        System.out.println("   Damage Dealt: " + attackPower + " HP");
        System.out.println("   Effect: Heavy physical damage with no special abilities");
    }

    public void displayInfo() {
        System.out.print("[WARRIOR] ");
        super.displayInfo();
    }

    public void executeSpecialAttack() {
        System.out.println("\n[WARRIOR SPECIAL] " + characterName + 
                         " executes a devastating WHIRLWIND STRIKE!");
        System.out.println("   Extra Damage: " + (int)(attackPower * 1.5) + " HP");
        System.out.println("   Hits all nearby enemies!");
    }
}
