package xyz.java1024.dao;

import java.util.List;
import xyz.java1024.vo.%;

public interface %Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(% record);

    % selectByPrimaryKey(Integer id);

    List<%> selectAll();

    int updateByPrimaryKey(% record);
}