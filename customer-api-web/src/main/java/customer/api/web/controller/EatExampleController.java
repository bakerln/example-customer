package customer.api.web.controller;

import common.framework.util.voutil.ResultWrapper;
import customer.api.pojo.vo.Food;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * <p>Description:  吃东西操作</p>
 *
 * @author linan
 * @date 2020-11-03
 */
@Api(
        value = "/foodOperation" ,
        tags = "食物相关操作",
        description = "消费者所有吃东西操作"
)
@RequestMapping("/foodOperation")
public interface EatExampleController {

    @ApiOperation(
            value = "吃东西",
            notes = "请求参数为食物名称",
            response = ResultWrapper.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "foodName",//参数名字
                    value = "添加吃的对象",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "body"//参数类型 body代表json
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误",
                    response = ResultWrapper.class),

            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误",
                    response = ResultWrapper.class)
    })
    @PostMapping("/food")
    ResultWrapper createFood(@RequestBody Map foodName);


    @ApiOperation(
            value = "扔食物",
            notes = "请求参数为食物ID",
            response = ResultWrapper.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",//参数名字
                    value = "需要扔掉的食物ID",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "path"//参数类型 body代表json
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误",
                    response = ResultWrapper.class),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误",
                    response = ResultWrapper.class)
    })
    @DeleteMapping("/food/{id}")
    ResultWrapper throwFood(@PathVariable Integer id);

    @ApiOperation(
            value = "更新食物",
            notes = "请求参数为食物对象",
            response = ResultWrapper.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "food",//参数名字
                    value = "需要更新的食物",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "body",//请求类型 body代表json
                    dataType = "Food"//参数类型
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误",
                    response = ResultWrapper.class),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误",
                    response = ResultWrapper.class)
    })
    @PutMapping("/food")
    ResultWrapper updateFood(@RequestBody Food food);

    @ApiOperation(
            value = "查看食物",
            notes = "请求参数为食物ID",
            response = ResultWrapper.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",//参数名字
                    value = "需要查看的食物ID",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "path"//参数类型 body代表json
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误",
                    response = ResultWrapper.class),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误",
                    response = ResultWrapper.class)
    })
    @GetMapping("/food/{id}")
    ResultWrapper getFood(@PathVariable Integer id);


    @ApiOperation(
            value = "查看食物列表",
            notes = "无请求参数",
            response = ResultWrapper.class
    )
    @GetMapping("/getFood")
    ResultWrapper getFoodList();
}
