package com.itacst.dao;

import com.itacst.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    public List<User>queryUserList();
}
