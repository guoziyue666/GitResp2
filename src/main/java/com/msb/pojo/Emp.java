package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther:Guo ziyue
 * @Date: 2022/5/27 - 05 - 27 - 2022/5/27 - 21:28
 * @Description: com.msb.pojo
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emp implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;
}
