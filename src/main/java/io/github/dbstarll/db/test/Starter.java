package io.github.dbstarll.db.test;

import io.github.dbstarll.utils.spring.boot.BootLauncher;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Starter extends BootLauncher {
    /**
     * 启动类.
     *
     * @param args 外部参数
     * @throws IOException 获取环境参数异常时抛出
     */
    public static void main(final String[] args) throws IOException {
        new Starter().run("db-test", "db-test-datasource", args);
    }
}
