package com.zaky.pengembalian.controller;

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

import com.zaky.pengembalian.model.Pengembalian;
import com.zaky.pengembalian.service.PengembalianService;

@RestController
@RequestMapping("/api/pengembalian")
public class PengembalianController {
    @Autowired
    private PengembalianService pengembalianService;

    @GetMapping
    public List<Pengembalian> getAllPengembalian() {
        return pengembalianService.getAllPengembalian();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pengembalian> getPengambalianById(@PathVariable Long id) {
        Pengembalian pengembalian = pengembalianService.getPengembalianById(id);
        return pengembalian != null ? ResponseEntity.ok(pengembalian) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Pengembalian createPengembalian(@RequestBody Pengembalian pengembalian) {
        return pengembalianService.createPengembalian(pengembalian);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePengembalian(@PathVariable Long id) {
        pengembalianService.deletePengembalian(id);
        return ResponseEntity.ok().build();
    }
}
