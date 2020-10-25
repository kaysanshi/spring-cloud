package com.kaysanshi.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author kay三石
 * @date:2019/5/27
 */
@Configuration
public class HystrixDashboardConfiguration {
    /**
     * 手动配置servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");//这里对应的是熔断器中的输入的路径.stream
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;

    }
}
