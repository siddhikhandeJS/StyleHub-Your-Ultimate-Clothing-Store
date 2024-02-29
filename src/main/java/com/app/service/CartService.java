package com.app.service;

import com.app.exception.ProductException;
import com.app.modal.Cart;
import com.app.modal.CartItem;
import com.app.modal.User;
import com.app.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
