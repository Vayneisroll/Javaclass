/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit20;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 *
 * @author tenberge
 */
public class HashFunctionExample {

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter some String:");
        String stringToHash = kb.nextLine();
       
        // the following example was taken from http://www.codejava.net/coding/how-to-calculate-md5-and-sha-hash-values-in-java       

        // First we need to create an object that will compute the hash function for us.
        // Java knows many different hash functions. Some of the best and most commonly used
        // hash functions are MD5, SHA-1, and SHA-256. You may have seen an "MD5" tag before
        // when you purchased mp3s online. 
        // All hash functions take some input of arbitrary length and turn them
        // into a hash output of finite length. 
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

        // Calling the digest method will compute the hash. 
        // "UTF-8" in this case is the character encoding.
        // In this case it means that any character is allowed,
        // even chinese characters or emojis.
        byte[] hashedBytesMD5 = md5.digest(stringToHash.getBytes("UTF-8"));
        byte[] hashedBytesSHA1 = sha1.digest(stringToHash.getBytes("UTF-8"));
        byte[] hashedBytesSHA256 = sha256.digest(stringToHash.getBytes("UTF-8"));

        // Now we can print the three different hashes. Note the return type
        // of the digest method is byte[], so we have to convert the byte[] to something human readable.
        System.out.println("MD5: " + convertByteArrayToHexString(hashedBytesMD5));
        System.out.println("SHA-1: " + convertByteArrayToHexString(hashedBytesSHA1));
        System.out.println("SHA-256: " + convertByteArrayToHexString(hashedBytesSHA256));
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        String hexString = "";
        for (int i = 0; i < arrayBytes.length; i++) {
            hexString += Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1);
        }
        return hexString;
    }
}
