package com.github.xujianhua.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Binary Wang(https://github.com/xujianhua)
 */
@SpringBootApplication
@MapperScan("com.github.xujianhua.demo.ddy.dao")//告诉mapper所在的包名
public class WxMpDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(WxMpDemoApplication.class, args);
  }
}
