package za.ac.cput.lsp.Obey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrangedBasket implements ShoppingBasket {

    private List<String> shoppingItems = new ArrayList<String>();

    public String getProduct(int productIndex) {
        return shoppingItems.get(productIndex);
    }
    public void addProduct(String product) {
        shoppingItems.add(product);
        Collections.sort(shoppingItems);
    }
}
