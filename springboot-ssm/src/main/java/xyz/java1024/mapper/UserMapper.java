package xyz.java1024.mapper;

import xyz.java1024.vo.User;
import java.util.List;


public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUsername(String username);

    int updateByPrimaryKey(User record);

    List<User> list();

}