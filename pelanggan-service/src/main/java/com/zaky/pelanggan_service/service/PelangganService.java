package com.zaky.pelanggan_service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaky.pelanggan_service.model.Pelanggan;
import com.zaky.pelanggan_service.repository.PelangganRepository;

@Service
public class PelangganService {
    @Autowired
    private PelangganRepository pelangganRepository;
    
    public List<Pelanggan> getAllProduk() {
        return pelangganRepository.findAll();
    }
    public Pelanggan getProdukById(Long id) {
        return pelangganRepository.findById(id).orElse(null);
    }
    public Pelanggan createProduk(Pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }
    public void deleteProduk(Long id) {
        pelangganRepository.deleteById(id);
    }
    public List<Pelanggan> getAllPelanggans() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPelanggans'");
    }
    public Pelanggan getPelangganById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPelangganById'");
    }
    public Pelanggan createPelanggan(Pelanggan pelanggan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPelanggan'");
    }
    public void deletePelanggan(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePelanggan'");
    }

}
