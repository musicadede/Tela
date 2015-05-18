package com.example.tela;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.VerticalLayout;

@DesignRoot
public class MainView extends VerticalLayout implements View {

	Navigator navigator;
	
	
	class Buttonlistener implements Button.ClickListener{
		String meniitem;
		
		public void ButtonListener(String menuitem){
			this.meniitem =menuitem;
			
		}

		@Override
		public void buttonClick(ClickEvent event) {
			navigator.navigateTo(meniitem);
			
		}
		
	}
	
	public MainView() {
				
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
