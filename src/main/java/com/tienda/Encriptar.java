package com.tienda;

/**
 *
 * @author emers
 */
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encriptar {
    public static void main(String[] args) {
        var codigo = new BCryptPasswordEncoder();
        System.out.println("juan (123): "+codigo.encode("123"));
        System.out.println("rebeca (456): "+codigo.encode("456"));
        System.out.println("pedro (789): "+codigo.encode("789"));
    }
}

