package com.marko.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.marko.bookstore.domain.*;
import com.marko.bookstore.repository.BookToCartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marko.bookstore.repository.CartItemRepository;
import com.marko.bookstore.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemRepository cartItemRepository;
    @Autowired
    private BookToCartItemRepository bookToCartItemRepository;

    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }

    public CartItem updateCartItem(CartItem cartItem) {
        BigDecimal bigDecimal = new BigDecimal(cartItem.getBook().getOurPrice()).multiply(new BigDecimal(cartItem.getQty()));

        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        cartItem.setSubtotal(bigDecimal);

        cartItemRepository.save(cartItem);

        return cartItem;
    }

    @Override
    public CartItem addBookToCartItem(Book book, User user, int parseInt) {
        List<CartItem> cartItemList = findByShoppingCart(user.getShoppingCart());
        for(CartItem cartItem : cartItemList){
            if(book.getId()==cartItem.getBook().getId()){
                cartItem.setQty(cartItem.getQty()+parseInt);
                cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(parseInt)));
                cartItemRepository.save(cartItem);
                return cartItem;
            }
        }
        CartItem cartItem = new CartItem();
        cartItem.setShoppingCart(user.getShoppingCart());
        cartItem.setBook(book);

        cartItem.setQty(parseInt);
        cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(parseInt)));

        cartItem = cartItemRepository.save(cartItem);

        BookToCartItem bookToCartItem = new BookToCartItem();
        bookToCartItem.setBook(book);
        bookToCartItem.setCartItem(cartItem);
        bookToCartItemRepository.save(bookToCartItem);

        return cartItem;
    }

    @Override
    public CartItem findById(Long cartItemId) {
        return cartItemRepository.findById(cartItemId).orElse(null);
    }

    @Override
    public void removeCartItem(CartItem cartItem) {
        bookToCartItemRepository.deleteByCartItem(cartItem);
        cartItemRepository.delete(cartItem);
    }

}
