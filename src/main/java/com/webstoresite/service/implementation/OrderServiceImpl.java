package com.webstoresite.service.implementation;

import com.webstoresite.domain.Product;
import com.webstoresite.domain.repository.ProductRepository;
import com.webstoresite.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(Integer id, Integer amount) {
        Product product = productRepository.findOne(id.longValue());

        if(product.getUnitsInStock() < amount.longValue()){
            throw new IllegalArgumentException("There is not enough product in our stock." +
                    "Current status of your product in stock is: " + product.getUnitsInStock());
        } else {
            Long temp = product.getUnitsInStock() - amount.longValue();
            product.setUnitsInStock(temp);
            productRepository.save(product);
        }
    }
}
