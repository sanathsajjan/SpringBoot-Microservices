package com.sanath.userservice.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//Getters and setters using lombok.. We need to add lombok plugin in Idea otherwise it will show error
@NoArgsConstructor//TO create no Argument constructor - Lombok
@AllArgsConstructor//TO create Argument constructor - Lombok
public class DepartmentVO {

    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentDescription;
}
