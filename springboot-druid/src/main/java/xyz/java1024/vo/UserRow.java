package xyz.java1024.vo;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/21 19:23
 * @description：
 * @email : 1250402127@qq.com
 */
public class UserRow implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet;
    }
}
