package com.alexisegf.badapp;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DecryptTools {

    static String decrypt(String str) {
        try {
            byte[] decoded = Base64.getDecoder().decode(str.getBytes(StandardCharsets.UTF_8));

            SecretKey key = new SecretKeySpec("verybadkeyforyou".getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec("0000000000000000".getBytes(StandardCharsets.UTF_8)));
            return new String(cipher.doFinal(decoded));
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

}