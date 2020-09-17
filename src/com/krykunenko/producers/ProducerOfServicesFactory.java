package com.krykunenko.producers;

import com.krykunenko.products.ProducerOfServices;

public class ProducerOfServicesFactory implements ProducerFactory{
    @Override
    public Producer createProducer() {
        return new ProducerOfServices();
    }
}
