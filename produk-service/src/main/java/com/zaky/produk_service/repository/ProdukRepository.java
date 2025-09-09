package com.zaky.produk_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zaky.produk_service.model.Produk;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {

}
