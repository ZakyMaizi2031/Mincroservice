package com.zaky.orderservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zaky.orderservice.model.Orderservice;
import com.zaky.orderservice.service.OrderserviceService;

@RestController
@RequestMapping("/api/orderservice")
public class OrderserviceController {

    @Autowired
    private OrderserviceService orderserviceService;

    @GetMapping
    public List<Orderservice> getAllOrderservices() {
        return orderserviceService.getAllOrderservices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orderservice> getOrderserviceById(@PathVariable Long id) {
        Orderservice orderservice = orderserviceService.getOrderserviceById(id);
        return orderservice != null ? ResponseEntity.ok(orderservice) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Orderservice> createOrderservice(@RequestBody Orderservice orderservice) {
        Orderservice savedOrder = orderserviceService.createOrderservice(orderservice);
        return ResponseEntity.ok(savedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrderservice(@PathVariable Long id) {
        orderserviceService.deleteOrderservice(id);
        return ResponseEntity.ok().build();
    }
}
