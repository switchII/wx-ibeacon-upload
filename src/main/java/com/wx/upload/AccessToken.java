package com.wx.upload;

/**
 * 查询token
 * Created by luoandong on 16/10/20.
 */
public class AccessToken {

    static String appid = ""  ;
    static String appsecret = "" ;

    /**
     * 得到Token
     * @return
     */
    public static String getToken(){
        String s= HttpRequestUtil.sendGet("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid="+appid+"&secret="+appsecret);
        System.out.println(s);
        return s ;
    }

    public static void main(String[] args) {
        String str = "https://api.weixin.qq.com/shakearound/material/add?access_token="+getTokenStr()+"&type=Icon" ;
        System.out.println("str =  " + str);

    }

    public static String getTokenStr(){
        return "IJiDTn5IPMG9vexoJUeITE1wotW8tJIndCzJDI-GEhCoEb5m35XPtY5A0QOLJMGOXpq5MYIRfYgRoM30EUttn3rmO6n7SMnwFqd8N2pGNWDyIvplWNLM7cLb2OSGY5n8TIIjAHACRR" ;
    }

}
