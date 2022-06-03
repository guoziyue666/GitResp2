package com.msb.service;

import com.msb.pojo.Emp;

import java.util.List;

/**
 * @Auther:Guo ziyue
 * @Date: 2022/5/27 - 05 - 27 - 2022/5/27 - 21:34
 * @Description: com.msb.service
 * @Version: 1.0
 */
public interface EmpService {
    List<Emp> findAll();

    boolean delEmp(Integer empno, String ename);
}
