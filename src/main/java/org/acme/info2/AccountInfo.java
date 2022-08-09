package org.acme.info2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountInfo {
	private int accountId;

	public int getAccountId() {
		return accountId;
		
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
		
	}
}
