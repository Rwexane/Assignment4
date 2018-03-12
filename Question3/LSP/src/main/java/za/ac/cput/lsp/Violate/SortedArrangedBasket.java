package za.ac.cput.lsp.Violate;

import java.util.Collections;

public class SortedArrangedBasket extends ArrangedBasket {

    public void addProduct(String product) {
        super.addProduct(product);
        Collections.sort(super.shoppingProducts);
    }
}
