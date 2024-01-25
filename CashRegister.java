
import java.util.HashMap;
import java.util.Map;

public class CashRegister {

    private double cash;
    private Map<String, Integer> itemCounts;

    public CashRegister() {
        cash = 0;
        itemCounts = new HashMap<>();
    }

    public void addItem(String item, double price) {
        if (!itemCounts.containsKey(item)) {
            itemCounts.put(item, 0);
        }
        itemCounts.put(item, itemCounts.get(item) + 1);
        cash += price;
    }

    public void removeItem(String item, double price) {
        if (!itemCounts.containsKey(item)) {
            throw new IllegalArgumentException("Item not found: " + item);
        }
        itemCounts.put(item, itemCounts.get(item) - 1);
        if (itemCounts.get(item) < 0) {
            throw new IllegalStateException("Item count cannot be negative: " + item);
        }
        cash -= price;
    }

    public double getCash() {
        return cash;
    }

    public Map<String, Integer> getItemCounts() {
        return new HashMap<>(itemCounts);
    }
}
