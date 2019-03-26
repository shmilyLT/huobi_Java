package com.huobi.client.model.enums;

import com.huobi.client.impl.utils.EnumLookup;

/**
 * sys, web, api, app.
 */
public enum OrderSource {
	FLSYS("fl-sys"), //借贷强制平仓单（爆仓单）
	MARGINWEB("margin-web"), //借贷 Web 交易单
	MARGINAPI("margin-api"), //借贷 Api 交易单
	MARGINAPP("margin-app"), //借贷 App 交易单
	SPOTWEB("spot-web"), //现货 Web 交易单
	SPOTAPI("spot-api"), //现货 Api 交易单
	SPOTAPP("spot-app"), //现货 App 交易单
	INVALID("invalid");

//	margin-web	
//	margin-api	
//	margin-app	
//		
	private final String code;

	OrderSource(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	private static final EnumLookup<OrderSource> lookup = new EnumLookup<>(OrderSource.class);

	public static OrderSource lookup(String name) {
		return lookup.lookup(name);
	}
}
