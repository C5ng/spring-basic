package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderSerivce;
import hello.core.order.OrderServiceImpl;

public class OrderApplication {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderSerivce orderSerivce = new OrderServiceImpl();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderSerivce.createOrder(memberId, "itemA", 1000);
        System.out.println(order);
        System.out.println(order.calculatePrice());
    }
}
