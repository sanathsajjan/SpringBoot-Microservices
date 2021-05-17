package com.sanath.userservice.userservice.vo;

import com.sanath.userservice.userservice.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDepartmentVO {
    private Users users;
    private DepartmentVO department;
}
