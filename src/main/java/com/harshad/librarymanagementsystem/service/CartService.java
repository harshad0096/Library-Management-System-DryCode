package com.harshad.librarymanagementsystem.service;
// package com.mehmetpekdemir.librarymanagementsystem.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.mehmetpekdemir.librarymanagementsystem.entity.Book;
// import com.mehmetpekdemir.librarymanagementsystem.entity.Cart;
// import com.mehmetpekdemir.librarymanagementsystem.entity.CartItem;
// import com.mehmetpekdemir.librarymanagementsystem.entity.User;
// import com.mehmetpekdemir.librarymanagementsystem.repository.CartRepository;

// @Service
// public class CartService {

//     @Autowired
//     private CartRepository cartRepository;

//     public void addToCart(User user, Book book) {
//         Cart cart = user.getCart();
//         if (cart == null) {
//             cart = new Cart();
//             cart.setUser(user);
//         }

//         List<CartItem> cartItems = cart.getCartItems();
//         // Check if the book is already in the cart
//         Optional<CartItem> existingCartItem = cartItems.stream()
//                 .filter(item -> item.getBook().equals(book))
//                 .findFirst();


//         cartRepository.save(cart);
//     }

//     // Other cart management methods
// }

