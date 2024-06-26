package com.custom.sharewise.validation;

import org.springframework.stereotype.Component;

import com.custom.common.utilities.exception.CommonException;
import com.custom.sharewise.constants.FailureConstants;
import com.custom.sharewise.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class UserIdValidator implements BusinessValidator {

	private final UserRepository userRepository;

	@Override
	public void validate(Object value) throws CommonException {
		if (!userRepository.existsByUserId(Long.parseLong(value.toString()))) {
			throw new CommonException(FailureConstants.USER_NOT_FOUND.getFailureCode(),
					FailureConstants.USER_NOT_FOUND.getFailureMsg());
		}
	}

}
