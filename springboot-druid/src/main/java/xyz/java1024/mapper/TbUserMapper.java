package xyz.java1024.mapper;

import xyz.java1024.vo.User1;

import java.util.List;


public interface TbUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User1 record);

    User1 selectByPrimaryKey(Integer id);

    User1 selectByUsername(String username);

    int updateByPrimaryKey(User1 record);

    List<User1> list1();

}