package com.piaoniu.springTest.service;

import java.util.List;

/**
 * Created by Stephen Cai on 2017-11-03 20:43.
 */
public interface ShopService {
    String staticColors();

    List<String> immutable();

    String immutableString();
}
