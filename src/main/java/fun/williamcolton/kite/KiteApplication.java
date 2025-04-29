package fun.williamcolton.kite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("fun.williamcolton.kite.mapper")
@SpringBootApplication
public class KiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(KiteApplication.class, args);
    }

}
