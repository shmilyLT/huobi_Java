package com.huobi.client.model.enums;

/**
 * 1min, 5min, 15min, 30min, 60min, 1day, 1mon, 1week, 1year
 */
public enum CandlestickInterval {
	MIN1("1min"), // 1分钟
	MIN5("5min"), // 5分钟
	MIN15("15min"), // 15分钟
	MIN30("30min"), // 30分钟
	MIN60("60min"), // 60分钟
	DAY1("1day"), // 天
	MON1("1mon"), // 月
	WEEK1("1week"), // 周线
	YEAR1("1year"); // 年

	private final String code;

	CandlestickInterval(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}
}
