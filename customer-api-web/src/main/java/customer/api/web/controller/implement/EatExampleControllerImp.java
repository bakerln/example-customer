package customer.api.web.controller.implement;

import common.framework.util.voutil.ResultWrapper;
import common.framework.util.voutil.ResultWrapperUtil;
import customer.api.pojo.vo.Food;
import customer.api.web.controller.EatExampleController;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2020-11-03
 */
@RestController
public class EatExampleControllerImp implements EatExampleController {

    @Override
    public ResultWrapper createFood(Map foodName) {
        return ResultWrapperUtil.success(foodName.get("foodName"));
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
}
