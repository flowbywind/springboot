package com.wisely.highlight_spring4.chl.aop;

import java.lang.annotation.*;

/**
 * Created by myadmin on 2016/10/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
