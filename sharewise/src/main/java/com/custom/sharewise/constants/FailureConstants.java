package com.custom.sharewise.constants;

/**
 * Enum for storing the common failure HTTP codes and messages that can be used
 * across Spring Boot projects.
 * 
 * 
 * @author Abhijeet
 *
 */
public enum FailureConstants {

	INTERNAL_SERVER_ERROR(-1999, "Oops! Looks like something went wrong."),
	SIGN_UP_ERROR(-2000, "Error while creating user"),
	LOGIN_ERROR(-2001, "Error while logging in"),
	USER_ALREADY_EXISTS(-2002, "User already exists with the emailID"),
	UPDATE_USER_ERROR(-2003, "Error while updating user details"),
	PASSWORDS_DO_NOT_MATCH(-2004, "Passwords do not match"),
	ADD_USER_TO_GROUP_ERROR(-2005, "Error while adding user to the group"),
	ADD_ROLE_FOR_USER_ERROR(-2006, "Error while adding role to the user"),
	CREATE_GROUP_ERROR(-2007, "Error while creating group"),
	UPDATE_GROUP_ERROR(-2008, "Error while updating group details"),
	USER_NOT_GROUP_ADMIN(-2009, "User does not have privileges to edit the group details"),
	DELETE_GROUP_ERROR(-2010, "Error while deleting group"),
	GROUP_NOT_FOUND(-2011, "No existing group found"),
	USER_NOT_MAPPED_TO_GROUP(-2012, "User is not mapped to the group"),
	USER_NOT_FOUND(-2013, "User not found"),
	REMOVE_USER_FROM_GROUP_ERROR(-2014, "Error while removing user from the group");

	private final int failureCode;
	private final String failureMsg;

	private FailureConstants(int failureCode, String failureMsg) {
		this.failureCode = failureCode;
		this.failureMsg = failureMsg;
	}

	public int getFailureCode() {
		return failureCode;
	}

	public String getFailureMsg() {
		return failureMsg;
	}

	@Override
	public String toString() {
		return Integer.toString(failureCode) + "-" + failureMsg;
	}

}
