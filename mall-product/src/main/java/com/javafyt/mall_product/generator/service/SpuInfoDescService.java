package com.javafyt.mall_product.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javafyt.common.utils.PageUtils;
import com.javafyt.mall_product.generator.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author fyt
 * @email sunlightcs@gmail.com
 * @date 2022-04-09 17:17:05
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

