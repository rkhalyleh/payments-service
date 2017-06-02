/**
 * 
 */
package ps.paymentsService.service.orchestration;

import java.util.List;

import ps.paymentsService.model.Payment;

/**
 * @author rkhalayl
 *
 */
public interface PaymentsService {

	public List<Payment> getAllpaymentsServiceWithDetails();

	public Payment addPayment(Payment payment);
	
}
