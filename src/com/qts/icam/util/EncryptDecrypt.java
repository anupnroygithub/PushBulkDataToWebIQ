package com.qts.icam.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncryptDecrypt {

	
	private static byte[] keyValue = new byte[]{'A', 'S', 'e', 'c', 'u', 'r', 'e', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

	/**
	 * This method takes an object name as a String and returns the base64
	 * encoded value as a String.
	 * 
	 * @param String
	 * @return String
	 * 
	 */
	public String getBase64EncodedID(String strName) {
		byte[] encodedBytes = Base64.encodeBase64(strName.getBytes());
		return new String(encodedBytes);
	}

	/**
	 * 
	 * This method takes the base64 encoded value as a String and returns the
	 * decoded value as a String
	 * 
	 * @param String
	 * @return String
	 */
	public String getBase64DecodedID(String strName) {
		byte[] decodedBytes = Base64.decodeBase64(strName);
		return new String(decodedBytes);
	}
	
	
	/*
	 * This method generateKey() is used to generate a 
	 * secret key for AES algorithm
	 */
	
	private static Key generateKey(byte[] seed) throws Exception {       
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
	    sr.setSeed(seed);
	    kgen.init(128, sr); // 192 and 256 bits may not be available
	    SecretKey skey = kgen.generateKey();
	    byte[] rawKey = skey.getEncoded();
	    Key key = new SecretKeySpec(rawKey, "AES");
	    return key;
	}
	
	/*
	 * This method encrypt() is used to perform the 
	 * Encryption followed by Base64 Encoding
	 */ 
	
	public String encrypt(String plainText) throws Exception{
	    Key key = generateKey(keyValue);
	    Cipher cipher = Cipher.getInstance("AES");
	    cipher.init(Cipher.ENCRYPT_MODE, key);
	    byte[] encVal = cipher.doFinal(plainText.getBytes("UTF-8"));
	    String encryptedValue = Base64.encodeBase64String(encVal);
	    return encryptedValue;
	}

            
	/*
	 * This method decrypt() is used to perform the 
	 * Base64 Decoding followed by Decryption  
	 */
	
	public String decrypt(String encryptedText) throws Exception {
	    Key key = generateKey(keyValue);
	    Cipher cipher = Cipher.getInstance("AES");
	    cipher.init(Cipher.DECRYPT_MODE, key);
	    byte[] decodedValue = Base64.decodeBase64(encryptedText);
	    byte[] decValue = cipher.doFinal(decodedValue);
	    String decryptedValue = new String(decValue);
	    return decryptedValue;
	}
	
	/**
	 * this method is used to decrypt serialized object
	 * 
	 * @param path
	 * @return Object
	 */
	public Object decryptSerializedObject(String filePath){
		Object object = null;
		try {
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, generateKey(keyValue));
			CipherInputStream cipherInputStream = new CipherInputStream(new BufferedInputStream(new FileInputStream(filePath)),cipher);
			ObjectInputStream inputStream = new ObjectInputStream( cipherInputStream );
			SealedObject sealedObject = null;
			sealedObject = (SealedObject) inputStream.readObject();
			object =  sealedObject.getObject(cipher);
			inputStream.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return object;
}

	
}
