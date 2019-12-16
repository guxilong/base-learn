package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.pojo.TbItem;

/**
 * Created by Administrator on 2019/9/14.
 */
public interface ItemService {

     TbItem getItemById(long id);
     EasyUIDataGridResult getItemList(Integer page, Integer rows);

}
