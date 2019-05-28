package com.orange.minip.Mapper;/*
 *@author orange
 *@version 1.0.0
 *@Description 与information相关的mapper
 *@creatTime 2019年05月24日11:45:00
 */

import com.alibaba.fastjson.JSONObject;
import com.orange.minip.DataObject.Information;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.*;

@Mapper
@CacheNamespace(size = 512)
public interface InformationMapper {
    /**
     * 将信息存入information表中
     * @param information
     * @return
     */
    @Insert("insert into information(table_id,part_openid,info) values (#{tableId},#{partOpenid},#{info})")
    @Options(flushCache=Options.FlushCachePolicy.TRUE,timeout = 10000,
            useGeneratedKeys =true,keyProperty = "infoId",keyColumn = "info_id")
    int savaInfomation(Information information);

}
