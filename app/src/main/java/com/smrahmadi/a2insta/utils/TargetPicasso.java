package com.smrahmadi.a2insta.utils;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class TargetPicasso implements Target {
    @Override
    public ElementType[] value() {
        return new ElementType[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
