package com.custom.sharewise.request;

import java.io.Serializable;

import com.custom.common.utilities.validators.OptionalMobileNumber;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateUserRequest implements Serializable {

	private static final long serialVersionUID = -9100759041933563299L;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@OptionalMobileNumber
	private String mobileNumber;

}
