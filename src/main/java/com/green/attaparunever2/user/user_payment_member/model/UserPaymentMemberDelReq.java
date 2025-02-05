package com.green.attaparunever2.user.user_payment_member.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserPaymentMemberDelReq {

    @Schema(title = "주문 Id")
    private long orderId;

    @Schema(title = "유저 Id")
    private long userId;

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
