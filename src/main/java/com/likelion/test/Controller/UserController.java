package com.likelion.test.Controller;

import com.likelion.test.Domain.User.UserRequestDTO;
import com.likelion.test.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController // 프론트 통신 시 반환값이 crud임을 알려주는 어노테이션. 만약 그냥 @controller라고 쓰면 파일을 찾으려고 할 것임
public class UserController {
    private final UserService userService;
    @PostMapping("/user")
    public String createUser(@RequestBody UserRequestDTO dto) {
        userService.createUser(dto);

        return "성공적으로 생성되었습니다!";
    }
}
