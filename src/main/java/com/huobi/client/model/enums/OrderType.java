package com.huobi.client.model.enums;

import com.huobi.client.impl.utils.EnumLookup;

/**
 * buy-market, sell-market, buy-limit, buy-ioc, sell-ioc, buy-limit-maker,
 * sell-limit-maker.
 */
public enum OrderType {
	BUY_MARKET("buy-market"), // 市价买
	SELL_MARKET("sell-market"), // 市价卖
	BUY_LIMIT("buy-limit"), // 限价买
	SELL_LIMIT("sell-limit"), // 限价卖
	BUY_IOC("buy-ioc"), // 买入立即执行或撤销
	SELL_IOC("sell-ioc"), // 卖出立即执行或撤销
	BUY_LIMIT_MAKER("buy-limit-maker"), // 限价买入(只能成为maker)
	SELL_LIMIT_MAKER("sell-limit-maker"), // 限价卖出(只能成为maker)
	INVALID("invalid"); // 无效

	private final String code;

	OrderType(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	private static final EnumLookup<OrderType> lookup = new EnumLookup<>(OrderType.class);

	public static OrderType lookup(String name) {
		return lookup.lookup(name);
	}

}
