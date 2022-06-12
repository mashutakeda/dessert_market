import java.util.ArrayList;

/**
 * This will be the class that stores the data for the dessert store. We are assuming that a store can sell all
 * kinds of dessert.
 * @author Mashu Takeda mtakeda9
 * @version 1
 */
public class Store {
    private String name;
    private ArrayList<Dessert> desserts;

    /**
     * A constructor that only takes in name and creates an empty ArrayList of type Dessert.
     * @param name name of the store
     */
    public Store(String name) {
        this.name = name;
        desserts = new ArrayList<Dessert>();
    }

    /**
     * This method should take in a valid Dessert object and add it to the back of the ArrayList.
     * @param aDessert dessert that is added to the arraylist desserts
     */
    public void addDessert(Dessert aDessert) {
        desserts.add(aDessert);
    }

    /**
     * This method should take in a valid Dessert object and remove the first instance of it
     * from the ArrayList.
     * @param aDessert dessert that is removed from the arraylist desserts
     * @return the dessert that is removed from the arraylist or null of it's not found.
     */
    public Dessert removeDessert(Dessert aDessert) {
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).equals(aDessert)) {
                Dessert old = aDessert;
                desserts.remove(desserts.get(i));
                return old;
            }
        }
        return null;
    }

    /**
     * Method that takes in a valid Dessert object and find/return the dessert that has
     * the same sweetness and flavor.
     * @param aDessert the dessert we are finding from the store
     * @return the dessert if found or "null" if not found
     */
    public Dessert findDessert(Dessert aDessert) {
        Dessert d = null;
        int first = 0;
        int last = desserts.size() - 1;
        int mid;
        while (first <= last) {
            mid = (first + last) / 2;
            if (desserts.get(mid).compareTo(aDessert) == 0) {
                return desserts.get(mid);
            } else if (desserts.get(mid).compareTo(aDessert) > 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return d;
    }

    /**
     * Method that sorts the ArrayList in ascending order based on sweetness and flavor.
     * @return a sorted arraylist
     */
    public ArrayList<Dessert> sortStore() {
        Dessert smallest;

        for (int i = 0; i < desserts.size() - 1; i++) {
            int curr = i;
            for (int j = curr; j < desserts.size(); j++) {
                if (desserts.get(j).compareTo(desserts.get(curr)) < 0) {
                    curr = j;
                }
            }
            Dessert min = desserts.get(curr);
            desserts.set(curr, desserts.get(i));
            desserts.set(i, min);
        }
        return desserts;
    }

    /**
     * This method should take in a valid Dessert object and return the number of desserts in
     * the store that is greater or equal to the Dessert passed in.
     * @param aDessert specified dessert to see of the store has it or not
     */
    public void checkStore(Dessert aDessert) {
        int count = 0;
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).compareTo(aDessert) > 0) {
                count++;
            }
        }
    }

    /**
     * Getter for the dessert variable.
     * @return arraylist variable representing the list of desserts in the store.
     */
    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }
}