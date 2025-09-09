package com.zaky.orderservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Orderservice orderservice = OrderserviceService.getOrderserviceById(id);
        return orderservice != null ? ResponseEntity.ok(orderservice) : ResponseEntity.notFound().build();
    }
    @PostMapping
    public Orderservice createPelanggan(@RequestBody Orderservice orderservice) {
        return orderserviceService.createOrderservice(orderservice);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrderservice(@PathVariable Long id) {
        orderserviceService.deleteOrderservice(id);
        return ResponseEntity.ok().build();
    }
}
