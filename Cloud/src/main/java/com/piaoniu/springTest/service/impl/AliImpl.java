package com.piaoniu.springTest.service.impl;

import com.google.common.collect.ImmutableList;
import com.piaoniu.springTest.service.ShopService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Created by Stephen Cai on 2017-11-03 20:44.
 */
@Service
public class AliImpl implements ShopService{
    private  static  List<String> NOISE_COLORS ;
    private static final List<String> IMMUTABLE_COLORS = ImmutableList.of("红","黄");
    private static final String immu = "hao";
    private static final float width = 3.0F;
    static {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("红");
        newList.add("黄");
        NOISE_COLORS = Collections.unmodifiableList(newList);

    }

    @Override
    public String staticColors() {
        return NOISE_COLORS.toString();
    }
    @Override
    public List<String> immutable() {
        return IMMUTABLE_COLORS;
    }
    @Override
    public String immutableString() {
        return immu;
    }
}
