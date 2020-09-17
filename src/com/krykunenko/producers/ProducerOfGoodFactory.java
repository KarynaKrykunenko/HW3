package com.krykunenko.producers;

import com.krykunenko.products.ProducerOfGood;

public class ProducerOfGoodFactory implements ProducerFactory{
    @Override
    public Producer createProducer() {
        return new ProducerOfGood();

    }
}
