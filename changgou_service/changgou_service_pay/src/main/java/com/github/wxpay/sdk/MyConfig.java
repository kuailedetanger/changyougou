package com.github.wxpay.sdk;

import java.io.InputStream;

public class MyConfig implements WXPayConfig
{

    @Override
   public   String getAppID()
    {
        return "wx8397f8696b538317";
    }

    @Override
    public  String getMchID()
    {
        return "1473426802";
    }

    @Override
    public String getKey()
    {
        return "T6m9iK73b0kn9g5v426MKfHQH7X8rKwb";
    }

    @Override
    public InputStream getCertStream()
    {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs()
    {
        return 1;
    }

    @Override
    public int getHttpReadTimeoutMs()
    {
        return 0;
    }

//    public IWXPayDomain getWXPayDomain()
//    {
//        return new IWXPayDomain( )
//        {
//            public void report(String s, long l, Exception e)
//            {
//            }
//
//            public DomainInfo getDomain(WXPayConfig wxPayConfig)
//            {
//                return new DomainInfo("api.mch.weixin.qq.com", true);
//            }
//        };
//    }

}
