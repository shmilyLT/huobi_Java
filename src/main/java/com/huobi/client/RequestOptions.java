package com.huobi.client;

import com.huobi.client.exception.HuobiApiException;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The configuration for the request APIs
 */
public class RequestOptions {

	private String url = "https://api.huobi.pro";
	private static final Logger log = LoggerFactory.getLogger(RequestOptions.class);
	
	public RequestOptions() {
	}

	public RequestOptions(RequestOptions option) {
		this.url = option.url;
	}

	/**
	 * Set the URL for request.
	 * @param url The URL name like "https://api.huobi.pro".
	 */
	public void setUrl(String url) {
		try {
			URL u = new URL(url);
			if(log.isDebugEnabled()) {
				log.debug(u.toString());
			}
		} catch (Exception e) {
			throw new HuobiApiException(HuobiApiException.INPUT_ERROR, "The URI is incorrect: " + e.getMessage());
		}
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
}
