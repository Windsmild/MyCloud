package com.piaoniu.user.entity;

import com.piaoniu.common.entity.Entity;
import lombok.Data;

/**
 * Created by Stephen Cai on 2017-07-08 21:45.
 */
@Data
public class User extends Entity{
	String userName;
	String password;
}
