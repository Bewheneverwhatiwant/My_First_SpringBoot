package com.likelion.test.Controller;

import Domain.Hello.CalcResponsDTO;
import Domain.Hello.CalcRequestDTO;
import com.likelion.test.Service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController의 역할: 그냥 컨트롤러라고 쓰면, 내가 뭘 반환하고자 하는지 불확실함
// API 요청에 대한 Rest한 응답을 주겠다는 의미로 RestController라고 달아야 함
@RestController
@RequiredArgsConstructor
public class HelloController {

    public final HelloService helloService; //이렇게 불러오기 위해서, lombok.RequiredArgsConstructor;를 import

    // hello로 요청이 들어오면, hello world를 반환하라
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    // @PathVariable: Path의 변수를 받아오라는 어노테이션
    @PostMapping("/sum/{a}/{b}")
    public Integer summary(@PathVariable Integer a, @PathVariable Integer b) {
        return a+b;
    }

//    @PostMapping("/sum2/{a}/{b}")
//    public List<Integer> summary2(@PathVariable Integer a, @PathVariable Integer b) {
//        Integer add = a + b;
//        Integer sub = a - b;
//
//        List<Integer> result = new ArrayList<>();
//        result.add(add);
//        result.add(sub);
//
//        return result;
//    }

    @PostMapping("/sum2/{a}/{b}")
    public List<Integer> summary2(@PathVariable Integer a, @PathVariable Integer b) {
      List<Integer> result = helloService.addAndSub(a, b);

      return result;
    }

    @PostMapping("sum3")
    public CalcResponsDTO summary3(@RequestBody CalcRequestDTO dto) {
        CalcResponsDTO response = helloService.addAndSubFoeJSON(dto.getA(), dto.getB());
        return response;
    }


}
