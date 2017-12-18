package com.github.xujianhua.demo.wechat.handler;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.github.xujianhua.demo.wechat.builder.TextBuilder;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * @author Binary Wang(https://github.com/xujianhua)
 */
@Component
public class ScanHandler extends AbstractHandler {
	 @Override
	  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
	                                  Map<String, Object> context, WxMpService weixinService,
	                                  WxSessionManager sessionManager) throws WxErrorException {
		
		this.logger.info("ScanHandler");
		this.logger.info("ScanHandler");
		this.logger.info("ScanHandler");


	    return null;
	  }

}
