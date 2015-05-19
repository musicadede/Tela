package com.example.tela;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class Tela2 extends VerticalLayout implements View  {

	
	public Tela2() {

		UI.getCurrent().setSizeFull();
		
		HorizontalLayout geral= new HorizontalLayout();
		
		Panel painel = new Panel("Alterar Senha");
		painel.setWidth("350px");
		painel.setHeight("300px");
		painel.setIcon(FontAwesome.KEY);
		
		VerticalLayout vlinternoMaior= new VerticalLayout();
		vlinternoMaior.setSpacing(true);
		VerticalLayout vlinterno1= new VerticalLayout();
		vlinterno1.setSizeFull();

		
		PasswordField senhaAtual = new PasswordField("Senha Atual");
		senhaAtual.setWidth("200px");
		PasswordField novaSenha = new PasswordField("Nova Senha(Min. 8 Caracteres)");
		novaSenha.setWidth("200px");
		PasswordField repitaNovaSenha = new PasswordField("Repita a Nova Senha");
		repitaNovaSenha.setWidth("200px");
		
		Button salvar = new Button("Salvar");
		
			salvar.addClickListener( new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					Notification.show("Salvo com Sucesso!");
					
//					UI.getCurrent().getNavigator().navigateTo("alterar-senha");
				}
			});
			
			Button voltar = new Button("Tela 3",new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					new Tela3();
					
				}
			});
		
		
		vlinternoMaior.addComponents(senhaAtual,novaSenha,repitaNovaSenha,salvar);
		vlinternoMaior.setSizeFull();
		vlinternoMaior.setComponentAlignment(senhaAtual, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(novaSenha, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(repitaNovaSenha, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(salvar, Alignment.MIDDLE_CENTER);
		painel.setContent(vlinternoMaior);
		
		geral.addComponent(painel);
		geral.addComponent(voltar);
		geral.setSizeFull();
		geral.setComponentAlignment(painel, Alignment.MIDDLE_CENTER);
		this.addComponent(geral);
		
		UI.getCurrent().setContent(this);
	}
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
