package com.interface21.beans.factory;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;

public interface BeanFactory {

    Set<Class<?>> getBeanClasses();

    <T> T getBean(Class<T> clazz);

    Map<Class<?>, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType);

    void clear();
}
