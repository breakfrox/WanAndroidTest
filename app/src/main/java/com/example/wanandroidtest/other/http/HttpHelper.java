package com.example.wanandroidtest.other.http;

import com.example.wanandroidtest.other.bean.BaseResponse;
import com.example.wanandroidtest.other.bean.hierarchy.KnowledgeHierarchyData;
import com.example.wanandroidtest.other.bean.main.banner.BannerData;
import com.example.wanandroidtest.other.bean.main.collect.FeedArticleListData;
import com.example.wanandroidtest.other.bean.main.login.LoginData;
import com.example.wanandroidtest.other.bean.main.search.TopSearchData;
import com.example.wanandroidtest.other.bean.main.search.UsefulSiteData;
import com.example.wanandroidtest.other.bean.navigation.NavigationListData;
import com.example.wanandroidtest.other.bean.project.ProjectClassifyData;
import com.example.wanandroidtest.other.bean.project.ProjectListData;

import java.util.List;

import io.reactivex.Observable;


/**
 * @author quchao
 * @date 2017/11/27
 */

public interface  HttpHelper {

    /**
     * 获取feed文章列表
     *
     * @param pageNum 页数
     * @return feed文章列表数据
     */
    Observable<BaseResponse<FeedArticleListData>> getFeedArticleList(int pageNum);

    /**
     * 获取搜索的文章列表
     *
     * @param pageNum 页数
     * @param k 关键字
     * @return 搜索的文章数据
     */
    Observable<BaseResponse<FeedArticleListData>> getSearchList(int pageNum, String k);

    /**
     * 热搜
     * http://www.wanandroid.com//hotkey/json
     *
     * @return 热门搜索数据
     */
    Observable<BaseResponse<List<TopSearchData>>> getTopSearchData();

    /**
     * 常用网站
     * http://www.wanandroid.com/friend/json
     *
     * @return 常用网站数据
     */
    Observable<BaseResponse<List<UsefulSiteData>>> getUsefulSites();

    /**
     * 知识体系
     * http://www.wanandroid.com/tree/json
     *
     * @return 广告栏数据
     */
    Observable<BaseResponse<List<KnowledgeHierarchyData>>> getKnowledgeHierarchyData();

    /**
     * 知识体系下的文章
     * http://www.wanandroid.com/article/list/0?cid=60
     *
     * @param page page num
     * @param cid second page id
     * @return 知识体系数据
     */
    Observable<BaseResponse<FeedArticleListData>> getKnowledgeHierarchyDetailData(int page, int cid);

    /**
     * 导航
     * http://www.wanandroid.com/navi/json
     *
     * @return 知识体系feed文章数据
     */
    Observable<BaseResponse<List<NavigationListData>>> getNavigationListData();

    /**
     * 项目分类
     * http://www.wanandroid.com/project/tree/json
     *
     * @return 导航数据
     */
    Observable<BaseResponse<List<ProjectClassifyData>>> getProjectClassifyData();

    /**
     * 项目类别数据
     * http://www.wanandroid.com/project/list/1/json?cid=294
     *
     * @param page page num
     * @param cid second page id
     * @return 项目分类数据
     */
    Observable<BaseResponse<ProjectListData>> getProjectListData(int page, int cid);

    /**
     * 登陆
     * http://www.wanandroid.com/user/login
     *
     * @param username user name
     * @param password password
     * @return 项目类别数据
     */
    Observable<BaseResponse<LoginData>> getLoginData(String username, String password);

    /**
     * 注册
     * http://www.wanandroid.com/user/register
     *
     * @param username user name
     * @param password password
     * @param rePassword re password
     * @return 登陆数据
     */
    Observable<BaseResponse<LoginData>> getRegisterData(String username, String password, String rePassword);

    /**
     * 收藏站内文章
     * http://www.wanandroid.com/lg/collect/1165/json
     *
     * @param id article id
     * @return 注册数据
     */
    Observable<BaseResponse<FeedArticleListData>> addCollectArticle(int id);

    /**
     * 收藏站外文章
     * http://www.wanandroid.com/lg/collect/add/json
     *
     * @param title title
     * @param author author
     * @param link link
     * @return 收藏站内文章数据
     */
    Observable<BaseResponse<FeedArticleListData>> addCollectOutsideArticle(String title, String author, String link);

    /**
     * 获取收藏列表
     * http://www.wanandroid.com/lg/collect/list/0/json
     *
     * @param page page number
     * @return 收藏站外文章数据
     */
    Observable<BaseResponse<FeedArticleListData>> getCollectList(int page);

    /**
     * 取消收藏页面站内文章
     * http://www.wanandroid.com/lg/uncollect_originId/2333/json
     *
     * @param id article id
     * @return 收藏列表数据
     */
    Observable<BaseResponse<FeedArticleListData>> cancelCollectPageArticle(int id);

    /**
     * 取消站内文章
     * http://www.wanandroid.com/lg/uncollect_originId/2333/json
     *
     * @param id article id
     * @return 取消站内文章数据
     */
    Observable<BaseResponse<FeedArticleListData>> cancelCollectArticle(int id);

    /**
     * 广告栏
     * http://www.wanandroid.com/banner/json
     *
     * @return 取消收藏页面站内文章数据
     */
    Observable<BaseResponse<List<BannerData>>> getBannerData();


}
