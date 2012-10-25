/**
 * 
 */
package de.adorsys.errai.sample.client.local;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author boris
 *
 */
public class HomeView extends Composite{
	
	interface HomeViewUiBinder extends UiBinder<Widget, HomeView>{
		
	}
	@UiField
	SimplePanel mainPane ;
	@Inject
	private Event<AccountView> event ;
	
	@UiField
	Hyperlink createAccountLink;
	
	private static HomeViewUiBinder uiBinder =  GWT.create(HomeViewUiBinder.class); 
	public HomeView() {
		initWidget(uiBinder.createAndBindUi(this));
		createAccountLink.setHTML("<a href=\"/home\">Create Account</a>");
	}
	
	@UiHandler("createAccountLink")
	public void onCreateAccountLinkClicked(ClickEvent clickEvent){
		this.mainPane.setWidget(new AccountView());
	}
}
