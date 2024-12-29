package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static KoscheiTheDeathless getKoscheiTheDeathless(Ocean1 ocean) {
        return new KoscheiTheDeathless(ocean);
    }

    @Bean
    public static Ocean1 getOcean1(Island2 island2) {
        return new Ocean1(island2);
    }

    @Bean
    public static Island2 getIsland(Wood3 wood3) {
        return new Island2(wood3);
    }

    @Bean
    public static Wood3 getWood(Rabbit4 rabbit4) {
        return new Wood3(rabbit4);
    }

    @Bean
    public static Rabbit4 getRabbit4(Duck5 duck5) {
        return new Rabbit4(duck5);
    }

    @Bean
    public static Duck5 getDuck(Egg6 egg6) {
        return new Duck5(egg6);
    }

    @Bean
    public static Egg6 getEgg6(Needle7 needle7) {
        return new Egg6(needle7);
    }

    @Bean
    public static Needle7 getNeedle7(Deth8 deth8) {
        return new Needle7(deth8);
    }

    @Bean
    public static Deth8 getDeth8() {
        return new Deth8();
    }
}
