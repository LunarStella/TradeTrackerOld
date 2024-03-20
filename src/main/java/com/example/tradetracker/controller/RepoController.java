package com.example.tradetracker.controller;


import com.example.tradetracker.dto.StockTransactionDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RepoController {

    // 내가 주식을 산 것을 기록하는 method
    // 주식 종류, 주식 가격, 주식 개수, 날짜
    @PostMapping("/purchase")
    public String recordPurchase(@RequestBody StockTransactionDto stockTransactionDto){
        // 구매 로직 구현 필요

        return "구매 기록 성공";
    }

    // 내가 주식을 판 것을 기록하는 method
    // 주식 종류, 주식 가격, 주식 개수, 날짜,

    @PostMapping("/sell")
    public String recordSell(@RequestBody StockTransactionDto stockTransactionDto) {
        // 판매 로직 구현 필요

        return "판매 기록 성공";
    }

}
