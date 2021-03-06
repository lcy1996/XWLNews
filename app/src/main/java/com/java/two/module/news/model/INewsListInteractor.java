package com.java.two.module.news.model;

import com.java.two.callback.RequestCallback;

import rx.Subscription;

/**
 * ClassName: INewsListInteractor<p>
 * Author: oubowu<p>
 * Fuction: 新闻列表Model层接口<p>
 * CreateDate: 2016/2/17 21:02<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface INewsListInteractor<T> {

    Subscription requestNewsList(RequestCallback<T> callback, int pageNo, int pageSize, int category);

}
