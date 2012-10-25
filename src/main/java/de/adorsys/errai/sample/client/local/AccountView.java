/**
 * 
 */
package de.adorsys.errai.sample.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author boris
 *
 */
public class AccountView extends Composite{
	interface AccountViewUiBinder extends UiBinder<Widget , AccountView>{
		
	}
	private static AccountViewUiBinder uiBinder = GWT.create(AccountViewUiBinder.class);
	
	public AccountView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
