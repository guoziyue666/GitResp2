package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Auther:Guo ziyue
 * @Date: 2022/5/28 - 05 - 28 - 2022/5/28 - 11:14
 * @Description: com.msb.controller
 * @Version: 1.0
 */
@Controller
public class ThymeleafController {
    @Autowired
    private EmpService empService;

    @RequestMapping("showAllEmp")
    public String showEmp(Map<String,Object> map, HttpServletRequest request, HttpSession session){
        List<Emp> empList = empService.findAll();
        request.setAttribute("msg","requestMsg");
        session.setAttribute("msg","sessionMsg");
        request.getServletContext().setAttribute("msg","applicationMsg");
        int i = 1/0;
        map.put("empList",empList);
        map.put("emp",empList.get(0));
        return "showEmp";
    }

    @RequestMapping("delEmp")
    public String delEmp(Integer empno,String ename){
        boolean success = empService.delEmp(empno,ename);
        return "redirect:showAllEmp";
    }

    @RequestMapping("showIndex")
    public String showIndex(Map<String,Object> map){
        map.put("msg","testMessage");
        return "index";
    }
}
