package spark.share.springfactories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spark.share.springfactories.impl.SpringFactoriesServiceImpl;

/**
 * @author weiJohn
 * @version V1.00
 * @className SpringFactoriesAutoConfig
 * @date 02:38 2020-09-20
 */
@Configuration
public class SpringFactoriesAutoConfig {
    @Bean
    public SpringFactoriesService springFactoriesService() {
        return new SpringFactoriesServiceImpl();
    }
}
