package com.custom.sharewise.service;

import com.custom.common.utilities.exception.CommonException;
import com.custom.sharewise.authentication.CustomUserDetails;

public interface PaymentService {

	Object simplifyPayments(Long groupId, CustomUserDetails userDetails) throws CommonException;

	Object paymentSummary(Long groupId, CustomUserDetails userDetails) throws CommonException;

}
