package com.github.xiejinjun.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zxp.esclientrhl.annotation.EnableESTools;

/**
 * @author xiejinjun
 * @version 2020/11/29
 */
@SpringBootApplication
@EnableESTools
public class EsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }
}
