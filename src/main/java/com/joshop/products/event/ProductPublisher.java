package com.joshop.products.event;

import com.joshop.products.entity.Product;
import com.joshop.products.event.model.ProductEvent;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductPublisher {

    private final JmsTemplate jmsTemplate;

    public ProductPublisher(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendProductCreatedEvent(ProductEvent product) {

        jmsTemplate.convertAndSend("productCreatedQueue", product);
    }
}
