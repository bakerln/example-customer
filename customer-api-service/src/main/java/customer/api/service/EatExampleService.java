package customer.api.service;

import common.framework.cache.TimeCache;
import common.framework.wrapper.ResultWrapper;
import common.framework.wrapper.ResultWrapperUtil;
import customer.api.pojo.vo.Food;
import customer.api.rpc.EatExampleRPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>Description: HTTP/RPC 业务接口实现</p>
 *
 * @author linan
 * @date 2020-12-29
 */
@Service
public class EatExampleService implements EatExampleRPC {

    private static Logger logger = LoggerFactory.getLogger(EatExampleService.class);
    @Autowired
    private TimeCache timeCache;

    public ResultWrapper createFood(Food food) {
        //可加时间
        timeCache.put("timeCache1","this is a time Cache without Time");
        timeCache.get("timeCache1");
        return ResultWrapperUtil.success("EatImp save success from example-customer!",timeCache.get("timeCache1"));
    }

    @Override
    public ResultWrapper createFood() {
        logger.info("in createFood");
        return ResultWrapperUtil.success("EatImp save success from example-customer!",null);
    }

    @Override
    public ResultWrapper createDrink(String foodName,String drinkName) {
        logger.info("in createDrink");
        return ResultWrapperUtil.success("in createDrink :"+foodName+ ". drinkName :" + drinkName,null);
    }

    @Override
    public ResultWrapper createDrink12(List<String> foodNameList) {
        logger.info("foodNameList:{}",foodNameList);
        return ResultWrapperUtil.success("in createDrink12 :",foodNameList);
    }

    @Override
    public ResultWrapper createDrink1(List<Food> foodNameList) {
        logger.info("in createDrink1");
        return ResultWrapperUtil.success("in createDrink1 :",foodNameList);
    }

    @Override
    public ResultWrapper createDrink11(List<String> foodNameList) {
        logger.info("in createDrink11");
        return ResultWrapperUtil.success("in createDrink11 :",foodNameList);
    }

    @Override
    public ResultWrapper createDrink2(Map foodNameMap) {
        logger.info("in createDrink2");
        return ResultWrapperUtil.success("in createDrink2 :",foodNameMap);
    }

    @Override
    public ResultWrapper createDrink3(Food food) {
        logger.info("in createDrink3");
        return ResultWrapperUtil.success("in createDrink3 :",food);
    }

    @Override
    public ResultWrapper createDrink4() {
        logger.info("in createDrink4");
        return ResultWrapperUtil.success("in createDrink4 ");
    }
}
