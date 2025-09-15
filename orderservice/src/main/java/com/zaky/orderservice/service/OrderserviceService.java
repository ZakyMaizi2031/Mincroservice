package com.zaky.orderservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zaky.orderservice.model.Orderservice;
import com.zaky.orderservice.repository.OrderserviceRepository;
import com.zaky.orderservice.vo.Pelanggan;
import com.zaky.orderservice.vo.Produk;
import com.zaky.orderservice.vo.ResponseTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@Service

public class OrderserviceService {

    @Autowired
    private OrderserviceRepository orderserviceRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public List<Orderservice> getAllProduk() {
        return orderserviceRepository.findAll();
    }

    public Orderservice getProdukById(Long id) {
        return orderserviceRepository.findById(id).orElse(null);
    }

    public List<ResponseTemplate> getOrderWithProdukById(Long id){
        List<ResponseTemplate> responseList = new ArrayList<>();
        Orderservice order = getOrder(id);
        ServiceInstance serviceInstance = discoveryClient.getInstances("PRODUK").get(0);
        Produk produk = restTemplate.getForObject(serviceInstance.getUri() + "/api/produk/"
                + order.getProdukId(), Produk.class);
                serviceInstance = discoveryClient.getInstances("PELANGGAN").get(0);
        Pelanggan pelanggan = restTemplate.getForObject(serviceInstance.getUri() + "/api/pelanggan/"
                + order.getPelangganId(), Pelanggan.class);
        ResponseTemplate vo = new ResponseTemplate();
        vo.setOrder(order);
        vo.setProduk(produk);
        vo.setPelanggan(pelanggan);
        responseList.add(vo);
        return responseList;
    }

    private Orderservice getOrder(Long id) {
        return orderserviceRepository.findById(id)
                .orElse(null);
    }

    public Orderservice createProduk(Orderservice Orderservice) {
        return orderserviceRepository.save(Orderservice);
    }

    public void deleteProduk(Long id) {
        orderserviceRepository.deleteById(id);
    }

    public List<Orderservice> getAllOrderservices() {
        return orderserviceRepository.findAll();
    }

    public Orderservice getOrderserviceById(Long id) {
        return orderserviceRepository.findById(id).orElse(null);
    }

    public Orderservice createOrderservice(Orderservice orderservice) {
        return orderserviceRepository.save(orderservice);
    }

    public void deleteOrderservice(Long id) {
        orderserviceRepository.deleteById(id);
    }

    public ResponseTemplate createOrderWithProduct(ResponseTemplate request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createOrderWithProduct'");
    }

}
