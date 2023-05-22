@file:JvmName("RealmUtils")
package com.myiy.shoppingmemo.service

import com.myiy.shoppingmemo.domain.main.dao.ShoppingListDao
import io.realm.Realm


fun Realm.shoppingListModel():ShoppingListDao = ShoppingListDao(this)
