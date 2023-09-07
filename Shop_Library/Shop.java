package Shop_Library;

import java.util.ArrayList;

// Abstract class Shop
abstract class Shop {
    private String shopName;
    // private List<Product> products;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    // AddProduct
    // SellProduct
    // RemoveProduct

    public abstract void displayShopInfo();

    public abstract String GetCategory();
}