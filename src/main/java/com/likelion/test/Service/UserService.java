package com.likelion.test.Service;

import com.likelion.test.Domain.User.User;
import com.likelion.test.Domain.User.UserRequestDTO;
import com.likelion.test.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // final로 되어있는 애들을 니가 알아서 넣어라

public class UserService {
    private final UserRepository userRepository;

    public void createUser(UserRequestDTO dto) {

        User newUser = new User();

        newUser.setName(dto.getName());
        newUser.setMale(dto.isMale()); //boolean 은 get이 아니라 is...를 따름
        newUser.setMoney(0L); // long 타입 표시
        userRepository.save(newUser);

    }
}
