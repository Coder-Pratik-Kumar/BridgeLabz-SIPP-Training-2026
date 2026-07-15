// Superclass for Adventure Game Character System
public abstract class GameCharacter {
    protected String characterName;
    protected int health;
    protected int attackPower;

    public GameCharacter(String characterName, int health, int attackPower) {
        this.characterName = characterName;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Abstract method to be overridden by subclasses
    public abstract void performAttack();

    public String getCharacterName() {
        return characterName;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Character: " + characterName +
                " | Health: " + health +
                " | Attack Power: " + attackPower);
    }
}
