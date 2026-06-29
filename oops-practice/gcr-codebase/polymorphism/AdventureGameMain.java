// Adventure Game Character System Main - demonstrating polymorphism in game mechanics
public class AdventureGameMain {
    
    public static void main(String[] args) {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║     ADVENTURE GAME - CHARACTER BATTLE SYSTEM           ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Create game characters
        GameCharacter[] characters = new GameCharacter[5];
        characters[0] = new Warrior("Conan", 200, 50);
        characters[1] = new Mage("Gandalf", 120, 70, 100);
        characters[2] = new Archer("Robin Hood", 150, 45, 50);
        characters[3] = new Warrior("Aragorn", 180, 55);
        characters[4] = new Mage("Merlin", 130, 75, 100);
        
        // Display character lineup
        System.out.println("╔════════════════ CHARACTER LINEUP ═════════════════════╗\n");
        displayCharacterLineup(characters);
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
        
        // Start the battle
        startBattle(characters);
        
        // Display battle statistics
        displayBattleStatistics(characters);
    }
    
    // Display all characters in the battle
    public static void displayCharacterLineup(GameCharacter[] characters) {
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] instanceof Warrior) {
                ((Warrior) characters[i]).displayInfo();
            } else if (characters[i] instanceof Mage) {
                ((Mage) characters[i]).displayInfo();
            } else if (characters[i] instanceof Archer) {
                ((Archer) characters[i]).displayInfo();
            }
        }
    }
    
    // Start battle - polymorphic method dispatch
    public static void startBattle(GameCharacter[] characters) {
        System.out.println("\n╔════════════════ BATTLE COMMENCED! ════════════════════╗\n");
        System.out.println("Round 1: Each character performs an attack!\n");
        
        for (int i = 0; i < characters.length; i++) {
            System.out.println("--- Turn " + (i + 1) + " ---");
            characters[i].performAttack();  // Polymorphic call
            
            // Simulate damage to other characters
            int targetIndex = (i + 1) % characters.length;
            int damage = characters[i].getAttackPower();
            characters[targetIndex].takeDamage(damage);
            
            System.out.println("   Target: " + characters[targetIndex].getCharacterName() + 
                             " takes " + damage + " damage!");
            System.out.println("   " + characters[targetIndex].getCharacterName() + 
                             " Health: " + characters[targetIndex].getHealth() + " HP\n");
        }
        
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }
    
    // Display battle statistics with character counting
    public static void displayBattleStatistics(GameCharacter[] characters) {
        System.out.println("\n╔════════════════ BATTLE STATISTICS ════════════════════╗\n");
        
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;
        int totalDamage = 0;
        
        System.out.println("Character Status After Battle:\n");
        
        for (GameCharacter character : characters) {
            // Count character types using instanceof
            if (character instanceof Warrior) {
                warriorCount++;
                System.out.print("[WARRIOR] ");
            } else if (character instanceof Mage) {
                mageCount++;
                System.out.print("[MAGE] ");
            } else if (character instanceof Archer) {
                archerCount++;
                System.out.print("[ARCHER] ");
            }
            
            System.out.println(character.getCharacterName() + 
                             " - Health: " + character.getHealth() + 
                             " HP - Attack Power: " + character.getAttackPower());
            
            totalDamage += character.getAttackPower();
        }
        
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("Total Participants: " + characters.length);
        System.out.println("  • Warriors: " + warriorCount);
        System.out.println("  • Mages: " + mageCount);
        System.out.println("  • Archers: " + archerCount);
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Total Combat Power: " + totalDamage + " HP");
        
        // Determine battle outcome
        int avgHealth = 0;
        for (GameCharacter character : characters) {
            avgHealth += character.getHealth();
        }
        avgHealth /= characters.length;
        
        System.out.println("Average Health After Battle: " + avgHealth + " HP");
        System.out.println("═══════════════════════════════════════════════════════\n");
    }
}
