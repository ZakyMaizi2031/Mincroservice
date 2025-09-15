package com.zaky.orderservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zaky.orderservice.model.Orderservice;
import com.zaky.orderservice.service.OrderserviceService;
import com.zaky.orderservice.vo.ResponseTemplate;

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
    @GetMapping("/product/{id}")
    public ResponseEntity<List<ResponseTemplate>> getOrderWithProductById(@PathVariable Long id) {
        List<ResponseTemplate> responseTemplate = orderserviceService.getOrderWithProdukById(id);
        return responseTemplate != null ? ResponseEntity.ok(responseTemplate): ResponseEntity.notFound().build();
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
