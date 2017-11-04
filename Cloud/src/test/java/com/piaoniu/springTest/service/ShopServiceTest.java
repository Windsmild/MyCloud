package com.piaoniu.springTest.service;

import com.piaoniu.AbstractTest;
import javax.annotation.Resource;
import org.junit.Test;

/**
 * Created by Stephen Cai on 2017-11-04 09:51.
 */
public class ShopServiceTest extends AbstractTest {
        @Resource(name = "aliImpl")
        ShopService shopService;

        @Test
        public void staticTest() {
            shopService.staticColors();
        }
        @Test
        public void immu() {
            shopService.immutable();
            shopService.immutableString();
        }
}