package customer.api.web.controller.implement;

import common.framework.util.JsonUtil;
import common.framework.wrapper.ResultWrapper;
import common.framework.wrapper.ResultWrapperUtil;
import customer.api.pojo.vo.Food;
import customer.api.service.EatExampleService;
import customer.api.web.controller.EatExampleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>Description: 食物操作业务 HTTP接口实现</p>
 *
 * @author linan
 * @date 2020-11-03
 */
@RestController
public class EatExampleControllerImp implements EatExampleController {

    @Autowired
    private EatExampleService eatExampleService;

    @Override
    public ResultWrapper createFood(Food food) {
        return eatExampleService.createFood(food);
    }

    @Override
    public ResultWrapper throwFood(Integer id) {
        return ResultWrapperUtil.success(id);
    }

    @Override
    public ResultWrapper updateFood(Food food) {
        return ResultWrapperUtil.success(food);
    }

    @Override
    public ResultWrapper getFood(Integer id) {
        return ResultWrapperUtil.success(id);
    }

    @Override
    public ResultWrapper getFoodList() {
        return ResultWrapperUtil.success("foodlist", JsonUtil.toBean("{\"name\":\"hamburger\"}",Map.class));
    }
}
