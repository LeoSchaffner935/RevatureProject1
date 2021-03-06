package com.revature.project1.dao;

import com.revature.project1.annotations.Author;
import com.revature.project1.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

@Author(authorName = "Leo Schaffner",
        description = "Cart Data Access Object, JpaRepository methods called in CartService")
public interface CartDAO extends JpaRepository<Cart, Integer> {}
