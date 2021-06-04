//package customer.api.web.controller;
//
//import common.framework.wrapper.ResultWrapper;
//import customer.api.pojo.vo.Food;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * <p>Description: </p>
// *
// * @author linan
// * @date 2021-06-01
// */
//@Api(
//        value = "/rpc" ,
//        tags = "食物相关操作",
//        description = "消费者所有吃东西操作"
//)
//@RequestMapping("/rpc")
//public interface EatExampleRpcController {
//
//    @ApiOperation(
//            value = "添加食物",
//            notes = "请求参数为食物名称",
//            response = Food.class
//    )
//    @GetMapping(value = "/createFood")
//    ResultWrapper createFood();
//}
