package com.piaoniu.user.utils;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;

/**
 * Created by Stephen Cai on 2017-07-08 21:59.
 */
@Slf4j
public class UserUtils {

	private static final String EMPTY = "";
	private static final String PWD_SALT = "datoucai";// 密码加盐

	/**
	 * 加密用户密码
	 * @param password 用户密码
	 * @return 加密串
	 */
	public static String pwdWithSalt( String password){
		return md5(PWD_SALT + md5(password));
	}

	/**
	 * md5加密
	 * @param text
	 * @return
	 */
	public static String md5(String text){
		if (text != null) {
			try {
				// 创建具有指定算法名称的信息摘要
				MessageDigest md = MessageDigest.getInstance("MD5");
				// 使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
				byte[] results = md.digest(text.getBytes());
				// 将得到的字节数组变成字符串返回
				String resultString = parseByte2HexStr(results);
				return resultString.toUpperCase();
			} catch (Exception e) {
				log.error("md5 failed:" + text, e);
				return EMPTY;
			}
		}
		return EMPTY;
	}

	/**将二进制转换成16进制
	 * @param buf
	 * @return
	 */
	private static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

}
