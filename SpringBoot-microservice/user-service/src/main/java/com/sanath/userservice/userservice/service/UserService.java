package com.sanath.userservice.userservice.service;

import com.sanath.userservice.userservice.entity.Users;
import com.sanath.userservice.userservice.vo.UserDepartmentVO;

public interface UserService {
    Users save(Users users);
    UserDepartmentVO getUserDepartment(Long userId);
}
