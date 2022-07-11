package br.com.springboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDto {

    private Long id;
    private String name;
    private String username;
}
