package com.pan.idService.web;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient client;

	/**
	 * uuid生成器
	 * 
	 * @return
	 */
	@RequestMapping(value = "/uuid", method = RequestMethod.GET)
	public String getUUId() {
		ServiceInstance instance = client.getLocalServiceInstance();
		String result = UUID.randomUUID().toString();
		logger.info(
				"/uuid, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + result);
		return result;
	}

}
