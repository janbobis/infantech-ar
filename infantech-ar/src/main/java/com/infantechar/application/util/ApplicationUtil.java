package com.infantechar.application.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ApplicationUtil {
	private ApplicationUtil(){
		// ensures application is never re-instantiated
	}
	
	public static String encrypt(String inputStr) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.update(inputStr.getBytes("UTF-8"));
		
		byte[] hash = digest.digest();
		StringBuffer sb = new StringBuffer();		
		for(byte b: hash){
			sb.append(HEX_CHARS[(b & 0xFF) >> 4]);
		}
		return sb.toString();
	}	
}
