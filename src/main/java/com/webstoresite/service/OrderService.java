package com.webstoresite.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


public interface OrderService {

    void processOrder(Integer id, Integer amount);





}
