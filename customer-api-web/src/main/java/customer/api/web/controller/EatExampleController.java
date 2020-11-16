package customer.api.web.controller;

import common.framework.util.voutil.ResultWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:  吃东西操作</p>
 *
 * @author linan
 * @date 2020-11-03
 */
@Api(value = "/eat" ,tags = "消费Eat",description = "消费者所有吃东西操作")
@RequestMapping("/eat")
public interface EatExampleController {

    @ApiOperation(
            value = "吃东西",
            notes = "请求参数为食物名称",
            response = ResultWrapper.class
    )
    @ApiResponses(value ={
            @ApiResponse(code = 900,message = "009XX 业务相关错误",response = ResultWrapper.class),
            @ApiResponse(code = 500, message = "005XX 服务器相关错误",response = ResultWrapper.class)}
    )
    @PostMapping("/food")
    ResultWrapper eatFood(String foodName);
}
