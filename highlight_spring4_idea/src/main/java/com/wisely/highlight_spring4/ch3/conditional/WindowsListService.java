package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myadmin on 2016/10/22.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
