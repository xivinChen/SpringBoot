package xyz.java1024.dao;

import java.util.List;
import xyz.java1024.vo.ProductCommentReply;

public interface ProductCommentReplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCommentReply record);

    ProductCommentReply selectByPrimaryKey(Integer id);

    List<ProductCommentReply> selectAll();

    int updateByPrimaryKey(ProductCommentReply record);
}