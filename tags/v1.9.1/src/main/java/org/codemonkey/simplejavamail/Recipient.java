package org.codemonkey.simplejavamail;

import javax.mail.Message.RecipientType;

/**
 * An immutable recipient object, with a name, emailadres and recipient type (eg {@link RecipientType#BCC}).
 * 
 * @author Benny Bottema
 */
final class Recipient {

	private final String name;

	private final String address;

	private final RecipientType type;

	/**
	 * Constructor; initializes this recipient object.
	 * 
	 * @param name The name of the recipient.
	 * @param address The email address of the recipient.
	 * @param type The recipient type (eg. {@link RecipientType#TO}).
	 * @see RecipientType
	 */
	public Recipient(final String name, final String address, final RecipientType type) {
		this.name = name;
		this.address = address;
		this.type = type;
	}

	/**
	 * Bean getter for {@link #name};
	 */
	public String getName() {
		return name;
	}

	/**
	 * Bean getter for {@link #address};
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Bean getter for {@link #type};
	 */
	public RecipientType getType() {
		return type;
	}
}