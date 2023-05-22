@file:JvmName("RealmUtils")
package com.myiy.shoppingmemo.service

import com.myiy.shoppingmemo.domain.main.dao.ShoppingListDao
import io.realm.Realm
import io.realm.RealmModel
import io.realm.RealmResults


fun Realm.shoppingListModel():ShoppingListDao = ShoppingListDao(this)

fun <T:RealmModel> RealmResults<T>.asLiveData() = LiveRealmData<T>(this)
