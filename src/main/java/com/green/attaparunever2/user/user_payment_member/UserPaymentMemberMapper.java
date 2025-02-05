package com.green.attaparunever2.user.user_payment_member;

import com.green.attaparunever2.user.user_payment_member.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserPaymentMemberMapper {
    UserGetPointRes getPoint(long userId);
    int getOrderPrice(long orderId);
    int insertPaymentMember(UserPostPaymentReq p);
    int getPaymentMember(long orderId);
    UserGetPaymentInfoRes getPaymentInfo(UserGetPaymentInfoReq p);
    int patchPaymentMember(UserPatchPaymentMemberReq p); //내게 온 결제 승인 요청 수정
    int postPaymentMember(List<PostPaymentUserIdAndPoint> p); //결제 승인 요청 등록
    List<UserPaymentMemberDto> selUserPaymentMemberByOrderId(long orderId);
    UserPaymentMemberDto selUserPaymentMemberByOrderIdAndUserId(UserGetPaymentInfoReq req);
}