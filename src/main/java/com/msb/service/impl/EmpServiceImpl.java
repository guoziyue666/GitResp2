package com.msb.service.impl;

import com.msb.mapper.EmpMapper;
import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:Guo ziyue
 * @Date: 2022/5/27 - 05 - 27 - 2022/5/27 - 21:35
 * @Description: com.msb.service.impl
 * @Version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public boolean delEmp(Integer empno, String ename) {
        return empMapper.delEmp(empno,ename)>0;
    }


}
