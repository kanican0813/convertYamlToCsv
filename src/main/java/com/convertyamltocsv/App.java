package com.convertyamltocsv;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();

        /** Userクラスのロード */
        try {
            InputStream is = ClassLoader.getSystemResourceAsStream("user.yaml");
            User user = yaml.loadAs(is, User.class);
            System.out.println(user);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
