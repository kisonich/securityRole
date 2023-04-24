package com.kisonich.securityrole.dz32Role.repository;


import com.kisonich.securityrole.dz32Role.model.Book;
import com.kisonich.securityrole.dz32Role.model.Order;
import com.kisonich.securityrole.dz32Role.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);

    List<Order> findByBook(Book book);
}