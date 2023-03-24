package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Egg6 egg(Deth8 deth) {
        return new Egg6(getNeedle(deth));
    }
    @Bean
    public static Needle7 getNeedle(Deth8 deth) {
        return new Needle7(deth);
    }
    @Bean
    public Deth8 getDeth() {
        return new Deth8();
    }
}
