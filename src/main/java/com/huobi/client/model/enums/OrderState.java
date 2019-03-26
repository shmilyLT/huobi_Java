package com.huobi.client.model.enums;

import com.huobi.client.impl.utils.EnumLookup;

/**
 * SUBMITTED, PARTIALFILLED, CANCELLING. PARTIALCANCELED FILLED CANCELED
 */
public enum OrderState {
	SUBMITTED("submitted"), // 已提交
	PARTIALFILLED("partial-filled"), // 部分成交
	CANCELLING("cancelling"), // 已撤销(终态)
	PARTIALCANCELED("partial-canceled"), // 部分成交撤销(终态)
	FILLED("filled"), // 完全成交(终态)
	CANCELED("canceled");

	private final String code;

	OrderState(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	private static final EnumLookup<OrderState> lookup = new EnumLookup<>(OrderState.class);

	public static OrderState lookup(String name) {
		return lookup.lookup(name);
	}
}
