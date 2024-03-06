package com.likelion.test.Domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class UserRequestDTO {
    String name;
    boolean isMale;
}
