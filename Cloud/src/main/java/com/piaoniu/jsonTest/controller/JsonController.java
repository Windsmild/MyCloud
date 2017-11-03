package com.piaoniu.jsonTest.controller;

import com.piaoniu.jsonTest.entity.Shop;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Stephen Cai on 2017-11-03 20:38.
 */
@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public Shop getShopInJSON(@PathVariable String name) {
        Shop shop = new Shop();
        shop.setName(name);
        return shop;
    }
}