package com.javafyt.mall_product.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javafyt.common.utils.PageUtils;
import com.javafyt.mall_product.generator.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author fyt
 * @email sunlightcs@gmail.com
 * @date 2022-04-09 17:17:05
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

