import java.util.ArrayList;

/**
 * This will be the class for Bob where we will define Bob’s behaviors.
 * @author Mashu Takeda mtakeda9
 * @version 1
 */
public class Bob {
    /**
     * Method that takes in two store objects and see if sweetness of dessert
     * objects in store 1 are present in store 2.
     *
     * @param firstStore  the first store
     * @param secondStore the second store
     * @return if the store objects in store 1 are present in store 2
     */
    public static boolean compareStores(Store firstStore, Store secondStore) {
        ArrayList<Dessert> first = firstStore.getDesserts();
        boolean isTrue = false;
        for (int i = 0; i < first.size(); i++) {
            if (secondStore.findDessert(first.get(i)) != null) {
                isTrue = true;
            } else {
                return false;
            }
        }
        return isTrue;
    }

    /**
     * Method that takes in a valid Store object and a valid Dessert object and
     * return true or false depending on whether Bob was able to find his
     * dessert.
     * @param aStore the specified store by Bob
     * @param aDessert the specified dessert by Bob
     * @return boolean representing whether Bob was able to find the dessert in the store
     */
    public static boolean shop(Store aStore, Dessert aDessert) {
        boolean check = false;
        aStore.sortStore();

        for (int i = 0; i < aStore.getDesserts().size(); i++) {
            if (aDessert.compareTo(aStore.getDesserts().get(i)) == 0) {
                check = true;
                return check;
            } else {
                continue;
            }
        }
        return check;
    }
}