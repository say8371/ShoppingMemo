package com.myiy.shoppingmemo.domain.main.dao;

import io.realm.Realm;

public class ShoppingListDao {

    private Realm mRealm;

    public ShoppingListDao(Realm realm) {
        this.mRealm = realm;
    }
}
