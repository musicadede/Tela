package com.example.tela;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class Tela3 extends VerticalLayout implements View {
	
	
	public Tela3() {
		Label texto = new Label("Tela 3");
		
		Button t2 = new Button("Tela 2",new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				new Tela2();
				
			}
		});
		
		this.addComponent(texto);
		this.addComponent(t2);
		
		UI.getCurrent().setContent(this);
		
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
