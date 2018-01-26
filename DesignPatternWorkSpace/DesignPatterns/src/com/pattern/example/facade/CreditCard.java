package com.pattern.example.facade;

import Utility.FileUtil;

public class CreditCard {
	String cardType;
	String cardNumber;
	String cardExpDate;
	final String CC_DATA_FILE = "CC.txt";

	public CreditCard(String ccType, String ccNumber, String ccExpDate) {
		cardType = ccType;
		cardNumber = ccNumber;
		cardExpDate = ccExpDate;
	}

	public boolean isValid() {
		/*
		 * Let's go with simpler validation here to keep the example simpler.
		 */
		if (getCardType().equals(CreditCardType.VISA)) {
			return (getCardNumber().trim().length() == 16);
		}
		if (getCardType().equals(CreditCardType .DISCOVER)) {
			return (getCardNumber().trim().length() == 15);
		}
		if (getCardType().equals(CreditCardType.MASTER)) {
			return (getCardNumber().trim().length() == 16);
		}
		return false;
	}

	public boolean save() 
	{
		FileUtil futil = new FileUtil();
		String dataLine = getCardType() + "," + getCardNumber() + ","
				+ getCardExpDate();
		return futil.writeToFile(CC_DATA_FILE, dataLine, true, true);
	}

	public String getCardType() {
		return cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCardExpDate() {
		return cardExpDate;
	}
}
