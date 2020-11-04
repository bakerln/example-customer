//package customer.api.web.healthCheck;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * <p>Description: </p>
// *
// * @author linan
// * @date 2020-11-04
// */
//@RestController
//public class EdterHeath {
//    @Autowired
//    private MyHealthCheck myHealthChecker;
//
//    @GetMapping("/up")
//    public String up(Boolean up) {
//        myHealthChecker.setUp(up);
//        return up.toString();
//    }
//}
//
