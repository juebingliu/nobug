package com.dbpf.nobug.common.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class MD5Util {
	public final static String CHARSET_UTF8 = "UTF-8";

	public static String sign(String text, String key, String charset) {
		if ((charset == null) || StringUtils.trim(charset).equals("")) {
			charset = CHARSET_UTF8;
		}
		String str = text + key;
		return DigestUtils.md5Hex(getContentBytes(str, charset));
	}

	private static byte[] getContentBytes(String content, String charset) {
		if ((charset == null) || "".equals(StringUtils.trim(charset))) {
			return content.getBytes();
		}
		try {
			return content.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
		}
	}

	public static void main(String[] args) {
		String key = UUID.randomUUID().toString().replace("-", "");
		System.out.println("key:" + key);
		System.out.println(MD5Util.sign("123456", key, MD5Util.CHARSET_UTF8));
	}
}
