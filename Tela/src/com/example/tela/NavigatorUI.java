package com.example.tela;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

public class NavigatorUI extends UI{
	
	Navigator navigator;
	protected static final String MAINVIEW = "main";
	
	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Navigator Exemplo");
		
		navigator = new Navigator(this,this);
		
		navigator.addView("", new StartView());
		navigator.addView(MAINVIEW, new MainView());
	}

}
