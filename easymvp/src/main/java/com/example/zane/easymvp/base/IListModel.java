package com.example.zane.easymvp.base;

/**
 * Created by Zane on 16/4/10.
 * recycleview的item的数据model接口，方便一个recycleview展示不同的数据
 */
public interface IListModel {

    //不同的model实现这个方法返回不同的viewtype

    /**
     * return viewtype
     * @return
     */
    public int getModelViewType();

}
