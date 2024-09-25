package com.crudexample.course.repositories;

import com.crudexample.course.entities.OrderItem;
import com.crudexample.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
