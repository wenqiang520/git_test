package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.web.bind.annotation.ResponseBody;

public interface ItemsDao {

    Items findByid(Integer id);
}
