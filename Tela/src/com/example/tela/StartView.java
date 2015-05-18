package com.example.tela;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

public class StartView extends VerticalLayout implements View {

	Navigator navigator;
	protected static final String MAINVIEW = "main";
	
	public StartView() {

		setSizeFull();
	
		//navigator = new Navigator(MAINVIEW, new )
		
		Button botao = new Button("Vá para a Main View",new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				//navigator.va
				
			}
		});
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
