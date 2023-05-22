package com.myiy.shoppingmemo.domain.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.myiy.shoppingmemo.domain.main.dao.ShoppingListDao;
import com.myiy.shoppingmemo.domain.main.model.ShoppingList;
import com.myiy.shoppingmemo.service.RealmUtils;

import io.realm.Realm;

public class MainViewModel extends ViewModel {
    private Realm mDb;
    private MutableLiveData<ShoppingList> shoppingListLiveData;

    public MainViewModel() {
        mDb = Realm.getDefaultInstance();
        subscribeRecentShoppingList();
    }

    public LiveData<ShoppingList> getShoppingList() {
        return shoppingListLiveData;
    }

    @Override
    protected void onCleared() {
        mDb.close();
        super.onCleared();
    }

    private void subscribeRecentShoppingList() {
        shoppingListLiveData.setValue(RealmUtils.shoppingListModel(mDb).findShoppingListRecent());
    }
}