package com.hei.school.endpoint.big.sum;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

import static com.hei.school.service.event.GetBigSum.getBigSum;

@RestController
@AllArgsConstructor

public class BigSumController {

    @GetMapping("/big-sum")
    public static BigInteger bigSum(@RequestParam(name = "a") String a
            , @RequestParam(name = "b") String b){
        return getBigSum(a,b);
    }

}

