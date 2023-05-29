package com.rocker.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {

	private String transactionId = UUID.randomUUID().toString();
	private Stock stock;
	private LocalDateTime successTime;
	private double successAmount;
	private long quantity;
	private User buyer;
	private User seller;
	private Broker buyerBroker;
	private Broker sellerBroker;
}
