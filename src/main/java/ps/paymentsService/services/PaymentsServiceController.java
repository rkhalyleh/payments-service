/**
 * 
 */
package ps.paymentsService.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ps.paymentsService.model.Payment;
import ps.paymentsService.service.orchestration.PaymentsService;

/**
 * @author Rami
 *
 */
@RestController
@RequestMapping("/paymentsService")
public class PaymentsServiceController {
	
	final static Logger logger = Logger.getLogger(PaymentsServiceController.class);
	
	@Autowired
	private PaymentsService paymentsService;
	
	/**
	 * Get all paymentsService with details
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Payment>> getAllpaymentsServiceWithDetails() {
		List<Payment> paymentsServiceList = paymentsService.getAllpaymentsServiceWithDetails();
		
		return new ResponseEntity<List<Payment>>(paymentsServiceList, HttpStatus.OK);		
	}
	
	/**
	 * 
	 * @param payment
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST,  
			consumes = "application/json",
            produces = "application/json")
	public ResponseEntity<Payment> addPayment(@RequestBody  Payment payment, 
			HttpServletRequest request) {
		
		Payment paymentRes = paymentsService.addPayment(payment);
		
		return new ResponseEntity<Payment>(paymentRes, HttpStatus.OK);
	}

}
