package xyz.java1024.dao;

import java.util.List;
import xyz.java1024.vo.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer id);

    List<ProductCategory> selectAll();

    int updateByPrimaryKey(ProductCategory record);
}