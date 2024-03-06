package com.likelion.test.Service;


//사용자 정보같은 민감 사항은 ㅓㄴ트롤러가 아닌 서비스에서 작업한다.

import Domain.Hello.CalcResponsDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    public List<Integer> addAndSub(@PathVariable Integer a, @PathVariable Integer b) {
        Integer add = a + b;
        Integer sub = a - b;

        List<Integer> result = new ArrayList<>();
        result.add(add);
        result.add(sub);

        return result;
    }

    public CalcResponsDTO addAndSubFoeJSON(Integer a, Integer b) {
        Integer add = a + b;
        Integer sub = a - b;

        CalcResponsDTO response = new CalcResponsDTO();
        response.setAdd(add); // add 변수를 정의하라
        response.setSub(sub);

        return response;
    }
}
