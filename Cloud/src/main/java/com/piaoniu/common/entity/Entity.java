package com.piaoniu.common.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Stephen Cai on 2017-07-08 21:39.
 */

@Data
@ToString
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -1L;

	public static final int STATUS_VALID = 1;

	public static final int STATUS_INVALID = 0;

	public static final int STATUS_TO_AUDIT = 1;

	public static final int STATUS_AUDIT_PASS = 2;

	public static final int STATUS_AUDIT_REJECT = 3;

	public int id;
	Date updateTime;
	Date addTime;


}
