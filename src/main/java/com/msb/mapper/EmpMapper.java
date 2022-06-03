package com.msb.mapper;

import com.msb.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:Guo ziyue
 * @Date: 2022/5/27 - 05 - 27 - 2022/5/27 - 21:35
 * @Description: com.msb.mapper
 * @Version: 1.0
 */
@Mapper
public interface EmpMapper {
    List<Emp> findAll();

    int delEmp(Integer empno, String ename);
}
