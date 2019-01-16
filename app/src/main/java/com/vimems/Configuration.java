package com.vimems;

/**
 * Created by 孙敬钦 on 2019/1/13.
 */

public class Configuration {
    public static final String serverIP= "sun95.320.io";
    public static final String serverPort= "47793";

    public static final String rootUrl = "http://"+serverIP+":"+serverPort+"/TT/";
    //用户头像的url头，加上数据库中后面的字段构成完整路径，比如rootUrl+"mine/home/profile?url=/00/00/0/01/profile.gif
    public static final String userUrl = rootUrl+"mine/home/profile?url=";
    public static final String dynamicpic = rootUrl+"mine/home/dynamic?url=";
    public static final String albumImgUrl=rootUrl+"image/albumimg?url=";
    public static String accountId = "00000001";
    public static String sex;
    public static String name;
    public static String picUrl;
    //访问融云服务器获得token的路径
    public static String getTokenUrl = "http://api.cn.ronghub.com/user/getToken.json";
    public static final String appSecret = "1A7ZV9tt1ifK";
    public static final String appKey = "25wehl3u29hvw";
    //标识正在聊天用户的id，方便根据id进行积分操作
    public static String chatToId;
    //每次开启聊天窗口先初始化为0，每发送一条消息+1
    public static int sendCount = 0;
    //每次开启聊天窗口先初始化为0，每收到一条消息+1
    public static int receiveCount = 0;
    //每次开启聊天窗口先初始化为0，每发送一条需要付费的消息+1（除了女生给男生发都要付费）
    public static int sendValueCount = 0;
    //只有女性角色对男性角色发消息才是false，其他都是true
    public static boolean reduceIntegral = true;
    //积分是否不足的标志
    public static boolean lackIntegeral = false;

}
