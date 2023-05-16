package com.myiy.shoppingmemo.main.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ShoppingList extends RealmObject {
    @PrimaryKey
    private long shoppingId;
    @PrimaryKey
    private long itemId;
    private String itemName;
    private long amt;
    private String url;

    public long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
