package com.github.xujianhua.demo.wechat.handler;

import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Binary Wang(https://github.com/xujianhua)
 */
public abstract class AbstractHandler implements WxMpMessageHandler {
  protected Logger logger = LoggerFactory.getLogger(getClass());
}
