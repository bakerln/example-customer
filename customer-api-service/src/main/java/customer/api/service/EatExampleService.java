package customer.api.service;

import common.framework.wrapper.ResultWrapper;
import customer.api.pojo.vo.Food;

/**
 * <p>Description: HTTP 业务服务接口</p>
 *
 * @author linan
 * @date 2020-12-29
 */
public interface EatExampleService {

    ResultWrapper createFood(Food food);
}
