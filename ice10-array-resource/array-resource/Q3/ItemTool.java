import java.util.*;

public class ItemTool {
    public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> items, int weight) {
        List<InventoryItem> res = new ArrayList<InventoryItem>();
        for (InventoryItem item : items) {
            if (item.getWeight() < weight) {
                res.add(item);
            }
        }
        return res;
    }

    public static List<Magazine> getAllMagazines(InventoryItem[] items) {
        List<Magazine> res = new ArrayList<Magazine>();
        for (InventoryItem item : items) {
            if (item instanceof Magazine) {
                res.add((Magazine) item);
            }
        }
        return res;
    }

    public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category) {
        List<InventoryItem> res = new ArrayList<InventoryItem>();
        for (InventoryItem item : items) {
            if (!(item instanceof Book) && item.getCategory() == category) {
                res.add(item);
            }
        }
        return res;
    }

    public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(HashMap<String, InventoryItem> items, int numCpu) {
        List<Laptop> res = new ArrayList<Laptop>();
        for (InventoryItem item : items.values()) {
            if (item instanceof Laptop && ((Laptop) item).getNumCpu() > numCpu) {
                res.add((Laptop) item);
            }
        }
        return res.toArray(new Laptop[res.size()]);
    }
    
}
