package customer.api.rpc;

import common.framework.util.voutil.ResultWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>Description: RPC 业务服务接口</p>
 *
 * @author linan
 * @date 2020-12-29
 */
@FeignClient(name = "EXAMPLE-CUSTOMER")
public interface EatExampleRPC {

    @PostMapping("/rpc/EatExamplePRC/createFood")
    ResultWrapper createFood();
}
