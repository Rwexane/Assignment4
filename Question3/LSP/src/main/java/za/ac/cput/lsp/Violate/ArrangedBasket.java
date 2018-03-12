package za.ac.cput.lsp.Violate;

import java.util.List;
import java.util.ArrayList;

public class ArrangedBasket {

    protected List <String> shoppingProducts = new ArrayList<String>();

    public void addProduct(String product) {
        shoppingProducts.add(product);
    }

    public String getProduct(int productIndex) {
        return shoppingProducts.get(productIndex);
    }
}
