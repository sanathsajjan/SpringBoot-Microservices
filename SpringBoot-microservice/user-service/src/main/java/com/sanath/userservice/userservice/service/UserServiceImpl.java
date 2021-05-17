package com.sanath.userservice.userservice.service;

import com.sanath.userservice.userservice.entity.Users;
import com.sanath.userservice.userservice.repository.UsersRepository;
import com.sanath.userservice.userservice.vo.DepartmentVO;
import com.sanath.userservice.userservice.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }


    @Override
    public UserDepartmentVO getUserDepartment(Long userId){
        UserDepartmentVO userDepartmentVO = new UserDepartmentVO();
        userDepartmentVO.setUsers(usersRepository.findByUserId(userId));
//        userDepartmentVO.setDepartment( restTemplate.getForObject("http://localhost:9001/departments/"+userId, DepartmentVO.class));
        userDepartmentVO.setDepartment( restTemplate.getForObject("http://Department-Service/departments/"+userId, DepartmentVO.class));
        return userDepartmentVO;
    }
}
