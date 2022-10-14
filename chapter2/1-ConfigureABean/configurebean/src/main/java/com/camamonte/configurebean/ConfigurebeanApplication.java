package com.camamonte.configurebean;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigurebeanApplication {

    // this code is replaced by the following code
/*	public static void main(String[] args) {
		var ctx = SpringApplication.run(ConfigurebeanApplication.class, args);
		var calculator = ctx.getBean(Calculator.class);
		calculator.calculate(137, 21, '+');
		calculator.calculate(137, 21, '*');
		calculator.calculate(137, 21, '-');
	}

	@Bean
	public Calculator calculator(Collection<Operation> operations) {
		return new Calculator(operations);
	}*/

    public static void main(String[] args) {
        SpringApplication.run(ConfigurebeanApplication.class, args);
    }

    @Bean
    public ApplicationRunner calculationRunner(Calculator calculator) {
        return args -> {
            calculator.calculate(137, 21, '+');
            calculator.calculate(137, 21, '*');
            calculator.calculate(137, 21, '-');
        };
    }
}
