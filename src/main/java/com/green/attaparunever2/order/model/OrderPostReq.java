package com.green.attaparunever2.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title = "주문 등록")
public class OrderPostReq {
    @JsonIgnore
    private long orderId;

    private long userId;
    private long restaurantId;
}
