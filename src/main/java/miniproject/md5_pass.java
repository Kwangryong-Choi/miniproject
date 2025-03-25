package miniproject;

import java.security.MessageDigest;

import org.springframework.stereotype.Repository;

abstract public class md5_pass{
	public String md5_make(String pw) {
		StringBuilder sb = new StringBuilder();
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			md.update(pw.getBytes());
			for(byte b : md.digest()) {
				sb.append(String.format("%x", b));
			}
		} catch (Exception e) {
			sb.append("null");
		}finally {
			
		}
		
		return sb.toString();
	}
}
