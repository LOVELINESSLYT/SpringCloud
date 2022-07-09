package cn.lz.cloud.dataservice;

import brave.sampler.Sampler;
import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class DataServiceApplication {

    public static void main(String[] args) {
        // 因为要启动多个，例如 8001、8002、8003 ......
        // 所以采用自动切换端口，去启动，启动的时候我们等待第一个启动完成后，在启动第二个
        int port = 8001;
        for (int i = 1; i <= 9; i++) {
            port = Integer.parseInt(800 + "" + i);
            // 端口是否占用
            if (!NetUtil.isUsableLocalPort(port)) {
                System.err.printf("端口%d被占用了，无法正常启动，正在更换端口，请稍等片刻...... %n", port);
                if (port == 8009) {
                    System.exit(1);
                }
                continue;
            }
            break;
        }
        System.out.printf("端口%d，正在启动中...... %n", port);
        new SpringApplicationBuilder(DataServiceApplication.class).properties("server.port=" + port).run(args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}