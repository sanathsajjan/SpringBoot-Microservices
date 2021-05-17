package com.sanath.userservice.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentVO {

    private Long departmentId;
    private String departmentName;
    private String departmentCode;
    private String departmentDescription;
}
