package com.harshad.librarymanagementsystem.entity;


import javax.persistence.Entity;

import java.util.HashSet;

import javax.persistence.*;

import org.hibernate.mapping.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean enabled;

	// @OneToOne(mappedBy = "user")
    // private Cart cart;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private java.util.Set<Role> roles = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	// public Cart getCart() {
    //     return cart;
    // }

    // public void setCart(Cart cart) {
    //     this.cart = cart;
    // }


	public java.util.Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(java.util.Set<Role> roles) {
		this.roles = roles;
	}

	public User(Long id, String username, String password, boolean enabled, java.util.Set<Role> roles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}

    // getters and setters
    public User(){
    }
}

