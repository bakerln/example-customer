//package customer.api.web.healthCheck;
//
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//import org.springframework.stereotype.Component;
//
///**
// * <p>Description: 定义健康检测 ACTUATE</p>
// *
// * @author linan
// * @date 2020-11-04
// */
//@Component
//public class MyHealthCheck implements HealthIndicator {
//    private boolean up = true;
//
//    @Override
//    public Health health() {
//        if (up) {
//            //自定义监控内容
//            return new Health.Builder().withDetail("aaa_cnt", 10)
//                    .withDetail("bbb_status", "up").up().build();
//        } else {
//            return new Health.Builder().withDetail("error", "client is down").down().build();
//        }
//    }
//
//    public boolean isUp() {
//        return up;
//    }
//
//    public void setUp(boolean up) {
//        this.up = up;
//    }
//
//}
