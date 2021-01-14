package customer.api.service.implement;

import common.framework.cache.TimeCache;
import common.framework.wrapper.ResultWrapper;
import common.framework.wrapper.ResultWrapperUtil;
import customer.api.pojo.vo.Food;
import customer.api.rpc.EatExampleRPC;
import customer.api.service.EatExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Description: HTTP/RPC 业务接口实现</p>
 *
 * @author linan
 * @date 2020-12-29
 */
@Service
public class EatExampleServiceImp implements EatExampleService,EatExampleRPC {

    @Autowired
    private TimeCache timeCache;

    @Override
    public ResultWrapper createFood(Food food) {
        //可加时间
        timeCache.put("timeCache1","this is a time Cache without Time");
        timeCache.get("timeCache1");
        return ResultWrapperUtil.success("EatImp save success from example-customer!",null);
    }

    @Override
    public ResultWrapper createFood() {
        return ResultWrapperUtil.success("EatImp save success from example-customer!",null);
    }
}
