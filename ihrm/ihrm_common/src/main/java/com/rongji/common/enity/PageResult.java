package com.rongji.common.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * {
 *     "success":"成功",
 *     "code":"10000",
 *     "message":"ok",
 *     "data":{
 *         total：//总条数
 *         rows ：//数据列表
 *     }
 *
 * }
 */
public class PageResult<T> {
    private Long total;
    private List<T> rows;
}
