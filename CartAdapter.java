package com.aitechnologiesng.androidshoppingcart;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter {

    private static CartAdapter instance;
    private static List<CartHelper> cartList;

    public CartAdapter(List<CartHelper> cartList){
        CartAdapter.cartList = new ArrayList<>();
    }
    public static CartAdapter getInstance(){
        if(instance == null){
            instance = new CartAdapter(cartList);
        }
        return instance;
    }

    public List<CartHelper> getYourList(){
        return cartList;
    }
}
