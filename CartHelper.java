package com.aitechnologiesng.androidshoppingcart;


public  class CartHelper {
    String cartProductID, cartProductImgID, cartProductQty,cartProductName;
    int cartProductPrice;

    public CartHelper(String cartProductID, String cartProductImgID, String cartProductQty, int cartProductPrice, String cartProductName) {
        this.cartProductID = cartProductID;
        this.cartProductImgID = cartProductImgID;
        this.cartProductQty = cartProductQty;
        this.cartProductPrice = cartProductPrice;
        this.cartProductName = cartProductName;
    }

    public String getCartProductName() {
        return cartProductName;
    }


    public String getCartProductID() {
        return cartProductID;
    }


    public String getCartProductImgID() {
        return cartProductImgID;
    }


    public String getCartProductQty() {
        return cartProductQty;
    }


    public int getCartProductPrice() {
        return cartProductPrice;
    }


}
