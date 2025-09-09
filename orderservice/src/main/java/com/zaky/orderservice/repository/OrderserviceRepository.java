package com.zaky.orderservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zaky.orderservice.model.Orderservice;


@Repository
public interface OrderserviceRepository extends JpaRepository<Orderservice, Long> {

}
