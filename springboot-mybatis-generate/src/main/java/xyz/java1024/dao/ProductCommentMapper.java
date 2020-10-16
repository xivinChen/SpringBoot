package xyz.java1024.dao;

import java.util.List;
import xyz.java1024.vo.ProductComment;

public interface ProductCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductComment record);

    ProductComment selectByPrimaryKey(Integer id);

    List<ProductComment> selectAll();

    int updateByPrimaryKey(ProductComment record);
}