package com.huobi.client.model.event;

import com.huobi.client.model.TradeStatistics;

/**
 * The 24H trade statistics received by subscription of trade statistics.
 */
public class TradeStatisticsEvent {

	private String symbol;
	private long timeStamp;
	private TradeStatistics tradeStatistics;

	/**
	 * Get the symbol you subscribed.
	 *
	 * @return The symbol, like "btcusdt".
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Get the UNIX formatted timestamp generated by server in UTC.
	 *
	 * @return The timestamp.
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Get the trade statistics.
	 *
	 * @return The trade statistics data, see {@link TradeStatistics}
	 */
	public TradeStatistics getData() {
		return tradeStatistics;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setData(TradeStatistics tradeStatistics) {
		this.tradeStatistics = tradeStatistics;
	}
}
