package com.zjh.nettytest.test;

import io.netty.util.concurrent.*;

/**
 * Description: netty-test
 * DateTime: 2020/7/11 4:31 下午
 *
 * @author 张江浩
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        AnimalFactory factory = new AnimalFactory(Cat.class);
        Animal animal = factory.newAnimal();
        animal.say();
    }
}
