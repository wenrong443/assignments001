package com.interview.bean.system;

import com.interview.util.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(description = "Login Information (Admin)")
public class LoginAdmin {
    @ApiModelProperty(value = "Username / Email", required = true)
    @NotNull(message = ErrorCode.EMAIL_IS_EMPTY)
    private String username;

    @ApiModelProperty(value = "Password", required = true)
    @NotNull(message = ErrorCode.PASSWORD_IS_EMPTY)
    private String password;
}
