package org.igorborba.java24;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class KeyDerivationFunction { // KDF (funcao de derivacao de chave)
    // KDF - algorithm to encrypt values (requires quantum computing to broke this cryptography = strong encryption).

    // Algorithm: password + salt + iterations = strong password
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String password = "123456";

        byte[] salt = new byte[16];
        new SecureRandom().nextBytes(salt);

        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(),
                salt,
                65536, // iterations
                256 // lenght of the key
        );
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        byte[] key = factory.generateSecret(spec).getEncoded();

        System.out.println(Base64.getEncoder().encodeToString(key));


    }
}
