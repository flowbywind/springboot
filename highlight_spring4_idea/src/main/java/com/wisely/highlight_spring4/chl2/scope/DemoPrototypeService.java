package com.wisely.highlight_spring4.chl2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by myadmin on 2016/10/16.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
