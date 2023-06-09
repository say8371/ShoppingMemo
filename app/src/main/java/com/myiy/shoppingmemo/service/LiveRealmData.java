package com.myiy.shoppingmemo.service;

import androidx.lifecycle.LiveData;

import io.realm.RealmChangeListener;
import io.realm.RealmModel;
import io.realm.RealmResults;

public class LiveRealmData<T extends RealmModel> extends LiveData<RealmResults<T>> {

    private RealmResults<T> results;
    private final RealmChangeListener<RealmResults<T>> listener = new RealmChangeListener<RealmResults<T>>() {
        @Override
        public void onChange(RealmResults<T> ts) {
            setValue(results);
        }
    };

    public LiveRealmData(RealmResults<T> realmResults) {
        results = realmResults;
    }

    @Override
    protected void onActive() {
        results.addChangeListener(listener);
    }

    @Override
    protected void onInactive() {
        results.removeChangeListener(listener);
    }
}
