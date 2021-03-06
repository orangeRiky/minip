package com.orange.minip.Service;/*
 *@author orange
 *@version 1.0.0
 *@Description information相关service
 *@creatTime 2019年05月24日21:28:00
 */

import com.orange.minip.DataObject.Information;
import java.util.ArrayList;
import java.util.List;

public interface InformationService {
    /**
     * 保存information
     * @param information
     * @return
     */
    int saveInformation(Information information);

    /**
     * 获取一个表中的所有条information
     * @param tableId
     * @return
     */
    ArrayList<String> getAllInfo(Integer tableId);


    /***
     * 获取用户的填表信息
     * @param tableId 表格ID
     * @param partOpenid 用户ID
     * @return
     */
    String getInfo(Integer tableId,String partOpenid);


    /***
     * 根据表格ID删除填写信息
     * @param tableId
     * @return
     */
    int deleteInfoByTable(Integer tableId);

    /***
     * 修改填写信息
     * @param information
     * @return
     */
    int updateInformation(Information information);


    /***
     * 获取是否有数据
     * @param tableId
     * @param partOpenid
     * @return
     */
    int getCount(Integer tableId,String partOpenid);
}
