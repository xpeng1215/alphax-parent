package vip.alphax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("vip.alphax.modular.*.mapper")
public class AlphaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaxApplication.class, args);
	}

}

