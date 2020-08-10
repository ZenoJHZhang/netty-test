package com.zjh.nettytest.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description: netty-test
 * DateTime: 2020/8/3 9:40 上午
 *
 * @author 张江浩
 */
public class AnimalFactory<T extends Animal> {
    private final Class<T> clazz;

    public AnimalFactory(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T newAnimal() throws Exception {
        return clazz.getConstructor().newInstance();
    }
}
