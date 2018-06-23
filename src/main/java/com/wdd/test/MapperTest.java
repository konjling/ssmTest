package com.wdd.test;

import com.wdd.bean.Dept;
import com.wdd.dao.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试Dao层工作
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接AutoWire要使用的组建即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DeptMapper deptMapper;

    @Test
    public void testCRUD() {
        /*//创建ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取mapper*/
        System.out.println(deptMapper);
        //插入几个部门
        deptMapper.insertSelective(new Dept(null,"核弹部"));
    }
}