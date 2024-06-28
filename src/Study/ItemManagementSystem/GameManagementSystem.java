package Study.ItemManagementSystem;

public class GameManagementSystem {
    public static void main(String[] args) {
        Item healingPotion = new Item("힐링포션", "먹으면 체력이 회복된다", 0.1, 100000);
        Item manaPotion = new Item("마나포션", "먹으면 마나가 회복된다", 0.1, 120000);
        
        Inventory inventory = new Inventory(10);

        // 인벤토리에 아이템 추가 : 힐링포션 2개
        for (int i = 0; i < 2; i++){
            inventory.addItem(healingPotion);
        }
        
        // 인벤토리에 아이템 추가 : 마나포션 2개
        for (int i = 0; i < 2; i++){
            inventory.addItem(manaPotion);
        }

        // 인벤토리 정보 표시
        inventory.printinventory();

        // 인벤토리에서 아이템 제거: 힐링포션 1개, 마나포션 1개
        inventory.removeItem(healingPotion);
        inventory.removeItem(manaPotion);

        // 인벤토리 정보 표시
        inventory.printinventory();
        
    }
}
