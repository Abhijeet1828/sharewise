package com.custom.sharewise.constants;

public final class Constants {

	private Constants() {
		throw new IllegalStateException("Constants class cannot be instantiated");
	}

	// Version Constants
	public static final String API_VERSION_1 = "/api/v1";
	public static final String API_VERSION_2 = "/api/v2";

	// Controller Mapping Constants
	public static final String AUTHENTICATION_CONTROLLER = "/auth";
	public static final String USER_CONTROLLER = "/user";
	public static final String GROUP_CONTROLLER = "/group";
	public static final String GROUP_MEMBER_CONTROLLER = "/group-member";

	// User Roles
	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	
	// Validation Type Constants
	public static final String VALIDATION_USER_ID = "userId";
	public static final String VALIDATION_GROUP_ID = "groupId";
	public static final String VALIDATION_GROUP_ADMIN = "groupAdmin";
	
}
