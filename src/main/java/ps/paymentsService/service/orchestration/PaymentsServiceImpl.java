/**
 * 
 */
package ps.paymentsService.service.orchestration;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ps.paymentsService.model.Payment;

/**
 * @author rkhalayl
 *
 */
public class PaymentsServiceImpl implements PaymentsService{

	final static Logger logger = Logger.getLogger(PaymentsServiceImpl.class);

	List<Payment> paymentsList = new ArrayList<Payment>();
	
	@Override
	public List<Payment> getAllpaymentsServiceWithDetails() {
		paymentsList.add(new Payment("1", "PayPal", "2017"));
		paymentsList.add(new Payment("2", "Manual", "2017"));
		paymentsList.add(new Payment("3", "Visa", "4017"));
		
		return paymentsList;
	}

	@Override
	public Payment addPayment(Payment payment) {
		
		paymentsList.add(payment);
		
		return payment;
	}
}
