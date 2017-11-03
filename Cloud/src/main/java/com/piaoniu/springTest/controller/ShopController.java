package com.piaoniu.springTest.controller;

import com.piaoniu.springTest.service.ShopService;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Stephen Cai on 2017-11-03 20:45.
 */
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired private Map<String, ShopService> shopServiceMap;
    @Resource(name = "aliImpl")
    private ShopService shopService;

    @RequestMapping("/show")
    public ShopService show() {
        return shopService;
        //return shopServiceList;
    }
    @RequestMapping("/showMap")
    public Map<String,ShopService> showMap() {
        return shopServiceMap;
        //return shopServiceList;
    }
}
