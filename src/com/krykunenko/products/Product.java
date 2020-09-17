package com.krykunenko.products;

import com.krykunenko.producers.Producer;
import com.krykunenko.producers.ProducerFactory;
import com.krykunenko.producers.ProducerOfGoodFactory;

public class Product {
    public static void main ( String [] args){
        ProducerFactory ProducerFactory = new ProducerOfGoodFactory();
        Producer Producer = ProducerFactory.createProducer();
        Producer.createagood();


    }
}
