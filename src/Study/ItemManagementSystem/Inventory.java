package Study.ItemManagementSystem;

import java.util.ArrayList;

public class Inventory {
    private int capacity;
    private ArrayList<Item> items;

    public Inventory(int capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    // get함수
    public ArrayList<Item> getItems(){
        return items;
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println(item.getName() + "이 인벤토리에 추가되었습니다.");
    }

    public void removeItem(Item choicedItem){
        String choiceItemName = choicedItem.getName();
        int itemIndex;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getName().equals(choiceItemName)){
                itemIndex = i;
                items.remove(itemIndex);
                System.out.println(choiceItemName + "을 제거했다"); 
            }
        }
    }

    public double getInventoryWeight(){
        double totalWeight = 0;
        for (Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public int getInventoryValue(){
        int totalValue = 0;
        for (Item item : items){
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public void printinventory(){
        System.out.println("\n-------------< 아이템 정보 >---------------\n");
        for (Item item : items){
            System.out.println("이름: " + item.getName());
            System.out.println("무게: " + item.getWeight());
            System.out.println("가격: " + item.getValue());
            System.out.println("설명: " + item.getDescription());
        }
        System.out.println("\n-------------------------------------------\n");
    }
}
