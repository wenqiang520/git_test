package com.itheima;

import com.alibaba.druid.sql.dialect.mysql.visitor.MySql2OracleOutputVisitor;
import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItmsTest {
@Test
public void ItemsByid(){
            ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
            /*dao的测试*/
         /*   ItemsDao dao = ac.getBean(ItemsDao.class);
            Items item = dao.findByid(1);
            System.out.println(item.getName());*/

         /*service 的测试*/

    ItemsService itms = ac.getBean(ItemsService.class);
    String name = itms.findByid(1).getName();
    System.out.println(name);
}

    }


