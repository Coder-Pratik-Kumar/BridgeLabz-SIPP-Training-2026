// Archer class - attacks with ranged arrows
public class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String characterName, int health, int attackPower, int arrowCount) {
        super(characterName, health, attackPower);
        this.arrowCount = arrowCount;
    }

    @Override
    public void performAttack() {
        if (arrowCount > 0) {
            System.out.println("[ARCHER ATTACK] " + characterName + 
                             " shoots a precise arrow!");
            System.out.println("   ╔════════════════════════════╗");
            System.out.println("   ║ 🏹 ARROW SHOT ATTACK       ║");
            System.out.println("   ╚════════════════════════════╝");
            System.out.println("   Damage Dealt: " + attackPower + " HP");
            System.out.println("   Arrows Remaining: " + (arrowCount - 1) + "/50");
            System.out.println("   Effect: Ranged attack with critical hit chance");
            this.arrowCount--;
        } else {
            System.out.println("[ARCHER] " + characterName + " is out of arrows!");
        }
    }

    public void displayInfo() {
        System.out.print("[ARCHER] ");
        super.displayInfo();
        System.out.println("          Arrows: " + arrowCount);
    }

    public void executeMultishot() {
        if (arrowCount >= 3) {
            System.out.println("\n[ARCHER SPECIAL] " + characterName + 
                             " performs a rapid MULTISHOT!");
            System.out.println("   Extra Damage: " + (attackPower * 3) + " HP");
            System.out.println("   Arrows Used: 3");
            System.out.println("   Arrows Remaining: " + (arrowCount - 3) + "/50");
            this.arrowCount -= 3;
        } else {
            System.out.println("\n[ARCHER] " + characterName + 
                             " doesn't have enough arrows for multishot!");
        }
    }

    public int getArrowCount() {
        return arrowCount;
    }
}
