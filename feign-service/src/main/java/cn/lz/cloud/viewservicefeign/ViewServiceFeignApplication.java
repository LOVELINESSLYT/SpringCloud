package cn.lz.cloud.viewservicefeign;

import brave.sampler.Sampler;
import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class ViewServiceFeignApplication {

    public static void main(String[] args) {
        // 判断 rabiitMQ 是否启动
        int rabbitMQPort = 5672;
        if (NetUtil.isUsableLocalPort(rabbitMQPort)) {
            System.err.printf("未在端口%d 发现 rabbitMQ 服务，请检查 rabbitMQ 是否启动 %n", rabbitMQPort);
            System.exit(1);
        }
        // 因为要启动多个，例如 8011、8012、8013 ......
        // 所以采用自动切换端口，去启动，启动的时候我们等待第一个启动完成后，在启动第二个
        int port = 8011;
        for (int i = 1; i <= 9; i++) {
            port = Integer.parseInt(801 + "" + i);
            if (!NetUtil.isUsableLocalPort(port)) {
                System.err.printf("端口%d被占用了，无法正常启动，正在更换端口，请稍等片刻...... %n", port);
                if (port == 8019) {
                    System.exit(1);
                }
                continue;
            }
            break;
        }
        System.out.printf("端口%d，启动中...... %n", port);
        new SpringApplicationBuilder(ViewServiceFeignApplication.class).properties("server.port=" + port).run(args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}