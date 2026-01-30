public class Character {
    private int health ;
    private int stamina ;
    private int maxHealth ;
    private int maxStamina ;

    public Character(int health ,int stamina) {
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health = health;
        this.stamina = stamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina");
    }

    public void getStatus() {
        System.out.println("Character's health: " + this.health +", stamina: " + this.stamina);
    }

    public void swingSword() {
        this.stamina = stamina - 10;
        if (stamina < 0) {
            this.stamina = 0;
        } else {
            System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");
        }
        if (this.stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            damage = -damage ;
        }
        if (health - damage < 0) {
            this.health = 0 ;
            System.out.println("Character takes " + damage + " damage. Health is now " + (this.health) + ".");
        } else {
            this.health = health - damage;
            System.out.println("Character takes " + damage + " damage. Health is now " + (this.health) + ".");
        }
        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }

    public void rest() {
        this.health = maxHealth ;
        this.stamina = maxStamina ;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        getStatus();
    }
}
