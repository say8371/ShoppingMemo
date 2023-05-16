package com.myiy.shoppingmemo.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.myiy.shoppingmemo.main.model.ShoppingList;

import io.realm.Realm;

public class MainViewModel extends ViewModel {
    private Realm mDb;
    private MutableLiveData<ShoppingList> shoppingListLiveData;

    public MainViewModel() {
        mDb = Realm.getDefaultInstance();
    }

    public LiveData<ShoppingList> getShoppingList() {
        return shoppingListLiveData;
    }

    @Override
    protected void onCleared() {
        mDb.close();
        super.onCleared();
    }
}