package customer.api.web.controller.implement;

import common.framework.util.voutil.ResultWrapper;
import common.framework.util.voutil.ResultWrapperUtil;
import customer.api.web.controller.EatExampleController;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2020-11-03
 */
@RestController
public class EatExampleControllerImp implements EatExampleController {

    @Override
    public ResultWrapper eatFood(String foodName) {
        return ResultWrapperUtil.success();
    }
}
