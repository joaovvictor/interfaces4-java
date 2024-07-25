package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) { //TAXA DE JUROS
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) { //JUROS
			return amount * months / 100;	

	}

}
