package com.convertyamltocsv;

import org.yaml.snakeyaml.Yaml;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();

        /** Userクラスのロード */
        try {
            User user = yaml.loadAs(ClassLoader.getSystemResourceAsStream("user.yaml"), User.class);
            System.out.println(user);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
