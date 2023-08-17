package com.harshad.librarymanagementsystem.entity;
// package com.mehmetpekdemir.librarymanagementsystem.entity;


// import java.util.ArrayList;
// import java.util.List;
// import javax.persistence.*;


// @Entity
// public class Cart {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
    
//     @OneToOne
//     @JoinColumn(name = "user_id")
//     private User user;
    
//     @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
//     private List<CartItem> cartItems = new ArrayList<>();

// 	 // Getter and Setter for id
//      public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }
    
//     // Getter and Setter for user
//     public User getUser() {
//         return user;
//     }

//     public void setUser(User user) {
//         this.user = user;
//     }
    
//     // Getter and Setter for cartItems
//     public List<CartItem> getCartItems() {
//         return cartItems;
//     }

//     public void setCartItems(List<CartItem> cartItems) {
//         this.cartItems = cartItems;
//     }	Cart(){
		
// 	}
    
// }
