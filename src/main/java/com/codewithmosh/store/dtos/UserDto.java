package com.codewithmosh.store.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class UserDto {
//    @JsonIgnore -> to ignore a field in response
    private Long id;
//    @JsonProperty("user_name") -> to rename a filed
    private String name;
    private String email;
//    @JsonInclude(JsonInclude.Include.NON_NULL) -> to skip fields with null value
//    private String phoneNumber;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") -> to format a field
//    private LocalDateTime createdAt;
}
