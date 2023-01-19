package com.prgms.awyspringdemo;

import com.prgms.awyspringdemo.order.Order;
import com.prgms.awyspringdemo.voucher.Voucher;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Optional;
import java.util.UUID;


@Configuration
@ComponentScan(basePackageClasses = {Order.class, Voucher.class})
@PropertySource(value = "application.yaml", factory = YamlPropertiesFactory.class)
@EnableConfigurationProperties
public class AppConfiguration {

}
