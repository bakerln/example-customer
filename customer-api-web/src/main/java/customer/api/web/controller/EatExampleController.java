package customer.api.web.controller;

import common.framework.wrapper.ResultWrapper;
import customer.api.pojo.vo.Food;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;


/**
 * <p>Description:  食物操作业务 HTTP接口</p>
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
            value = "添加食物",
            notes = "请求参数为食物名称",
            response = Food.class
    )
    @ApiResponses(value ={
            @ApiResponse(
                    code = 200,
                    message = "请求成功！"),
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误！"),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误！")
    })
    @PostMapping("/food")
    ResultWrapper createFood(@RequestBody Food food);

    @ApiOperation(
            value = "更新食物",
            notes = "请求参数为食物对象",
            response = Food.class
    )
    @PutMapping("/food")
    ResultWrapper updateFood(@RequestBody Food food);


    @ApiOperation(
            value = "查看食物列表",
            notes = "无请求参数"
    )
    @GetMapping("/getFood")
    ResultWrapper getFoodList();


    @ApiOperation(
            value = "查看食物",
            notes = "请求参数为食物ID"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",//参数名字
                    value = "需要查看的食物ID",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "path"
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 200,
                    message = "请求成功！"),
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误！"),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误！")
    })
    @GetMapping("/food/{id}")
    ResultWrapper getFood(@PathVariable Integer id);


    @ApiOperation(
            value = "扔食物",
            notes = "请求参数为食物ID"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",//参数名字
                    value = "需要扔掉的食物ID",//参数的描述
                    required = true,//是否必须传参数，true是
                    paramType = "path"
            )
    })
    @ApiResponses(value ={
            @ApiResponse(
                    code = 200,
                    message = "请求成功！"),
            @ApiResponse(
                    code = 900,
                    message = "009XX 业务相关错误！"),
            @ApiResponse(
                    code = 500,
                    message = "005XX 服务器相关错误！")
    })
    @DeleteMapping("/food/{id}")
    ResultWrapper throwFood(@PathVariable Integer id);

}
