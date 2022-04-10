package com.javafyt.mall_product.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javafyt.common.utils.PageUtils;
import com.javafyt.mall_product.generator.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author fyt
 * @email sunlightcs@gmail.com
 * @date 2022-04-09 17:17:06
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

