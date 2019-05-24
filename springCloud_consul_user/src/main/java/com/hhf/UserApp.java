package com.hhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 *  1.本地启动consul : consul agent -dev -ui -node=cy
 *  备注： -dev开发服务器模式启动，-node结点名为cy，-ui可以用界面访问，默认能访问。
 *  2.localhost:8500连接consul，查看注册信息
 *  3.启动userApp
 * @author hhf
 *
 */


@SpringBootApplication
@EnableDiscoveryClient//注册中心是zk或Consul时，向注册中心注册信息
public class UserApp {

	public static void main(String[] args) {
		SpringApplication.run(UserApp.class, args);
	}
}
