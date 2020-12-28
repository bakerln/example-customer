package customer.api.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * <p>Description: food object</p>
 *
 * @author linan
 * @date 2020-12-04
 */
@ApiModel(value="食物对象",description="请求参数对象" )
@Data
public class Food {
    @ApiModelProperty(value = "食物名称", required = true, example="noodles")
    @NotEmpty
    private String foodName;
    @ApiModelProperty(value = "食物编码", required = true, example="3")
    @NotEmpty
    private Integer foodID;
}
