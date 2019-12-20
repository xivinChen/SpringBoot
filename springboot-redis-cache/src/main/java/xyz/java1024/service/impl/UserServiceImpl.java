package xyz.java1024.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import xyz.java1024.mapper.UserMapper;
import xyz.java1024.service.UserService;
import xyz.java1024.vo.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xivin
 * @email 1250402127@qq.com
 * @description
 * @date 2019/12/19
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "user:id",key = "#id")
    public User getOneUser(int id) {
        logger.info("get one go mysql ...");
        return userMapper.selectByPrimaryKey(id);
    }

    //@Cacheable(value = "user:list")
    @Override
    public List<User> findAll() {
        logger.info("find all go mysql ...");
        return userMapper.list();
    }

    @CacheEvict(value = "user:list",allEntries = true)
    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Caching(
            evict = {
                    @CacheEvict(value = "user:id", key = "#user.id"),
                    @CacheEvict(value = "user:list", allEntries = true)
            }
    )
    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Caching(
            evict = {
                    @CacheEvict(value = "user:id", key = "#id"),
                    @CacheEvict(value = "user:list", allEntries = true)
            }
    )
    @Override
    public int delete(int id) {
        return delete(id);
    }
}
