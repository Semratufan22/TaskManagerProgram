import java.util.ArrayList;

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();

        // Adding custom items to the inventory
        Item healthPotion = new Item("Health Potion", "Potion", 20);
        Item sword = new Item("Sword", "Weapon", 50);
        Item shield = new Item("Shield", "Armor", 30);
        Item elixir = new Item("Mana Elixir", "PcProtection", 10);
        Item magicStaff = new Item("Magic Staff", "PcProtection", 15);
        Item helmet = new Item("Helmet", "PcProtection", 20);

        inventory.add(healthPotion);
        inventory.add(sword);
        inventory.add(shield);
        inventory.add(elixir);
        inventory.add(magicStaff);
        inventory.add(helmet);

        // Displaying inventory items
        for (Item item : inventory) {
            System.out.println(item);

        }
        System.out.println( inventory.get(1).getType());

        //changing array list
        //shield.setValue(40);
        //System.out.println(inventory);
        //System.out.println(inventory.set(shield.getValue(40));
        //removing Item
        inventory.remove(5);

        for (Item item : inventory) {
            int totalValue = 0;
            totalValue += item.getValue();
            System.out.println(item);

            //calculating and displaying
            for (Item item : inventory) {

            }
            System.out.println("Total Value of All Items: " + totalValue);
        }

    }
}}