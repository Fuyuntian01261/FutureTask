package com.javafyt.mall_product.generator.dao;

import com.javafyt.mall_product.generator.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fyt
 * @email sunlightcs@gmail.com
 * @date 2022-04-09 17:17:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
