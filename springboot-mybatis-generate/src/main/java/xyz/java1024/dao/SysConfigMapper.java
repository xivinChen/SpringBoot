package xyz.java1024.dao;

import java.util.List;
import xyz.java1024.vo.SysConfig;

public interface SysConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysConfig record);

    SysConfig selectByPrimaryKey(Integer id);

    List<SysConfig> selectAll();

    int updateByPrimaryKey(SysConfig record);
}