package com.likelion.test.Domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// db 모델을 entity라고 한다. db 테이블을 어떻게 생성할지 정의한다고 보면 된다.
@Entity
@Getter @Setter
@NoArgsConstructor
public class User {

    // id 필드는 자동으로 만들어지는 애들이다.
    // id 필드는 AUTO 타입으로 만들어라. == 니가 관리하라. 스프링부트에게 id 관리를 위임
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private boolean isMale;
    private Long Money;
}
