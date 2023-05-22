package com.myiy.shoppingmemo.domain.main.dao;

import com.myiy.shoppingmemo.domain.main.model.ShoppingList;
import com.myiy.shoppingmemo.service.LiveRealmData;
import com.myiy.shoppingmemo.service.RealmUtils;

import io.realm.Realm;
import io.realm.Sort;

public class ShoppingListDao {

    private Realm mRealm;

    public ShoppingListDao(Realm realm) {
        this.mRealm = realm;
    }

    public ShoppingList findShoppingListRecent() {
        return mRealm.where(ShoppingList.class)
                .sort("shoppingId", Sort.DESCENDING)
                .findFirst();
    }

    public void addShoppingList(final long shoppingId, final long itemId, final String itemName, final long amt, final String url) {
        ShoppingList shoppingList = new ShoppingList(shoppingId, itemId, itemName, amt, url);
        mRealm.insert(shoppingList);
    }
}
