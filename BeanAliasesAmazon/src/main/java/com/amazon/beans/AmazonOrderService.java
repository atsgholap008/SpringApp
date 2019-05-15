package com.amazon.beans;

public class AmazonOrderService {
	private IDelivery bluedart;
	private IDelivery dtdc;

	public void setBluedart(BlueDartServiceImpl bluedart) {
		this.bluedart = bluedart;
	}

	public void setDtdc(DTDCServiceImpl dtdc) {
		this.dtdc = dtdc;
	}

	public void placeOrder(Order o, Address addr) {

		System.out.println("Order Placed...");

		if (addr.getZip() > 5000080) {
			bluedart.delivery();
		}
		else {
			dtdc.delivery();
		}
	}

}
