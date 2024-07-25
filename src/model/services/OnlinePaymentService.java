package model.services;

public interface OnlinePaymentService {
	
	Double paymentFee(Double amount); // TAXA DE PAGAMENTO
	Double interest(Double amount, Integer months); // JUROS

}
