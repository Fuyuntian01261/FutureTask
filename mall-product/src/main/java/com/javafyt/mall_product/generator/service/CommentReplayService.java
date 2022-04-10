package com.javafyt.mall_product.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javafyt.common.utils.PageUtils;
import com.javafyt.mall_product.generator.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author fyt
 * @email sunlightcs@gmail.com
 * @date 2022-04-09 17:17:06
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

