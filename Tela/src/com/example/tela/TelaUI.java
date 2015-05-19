package com.example.tela;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("runo")
public class TelaUI extends UI {//VerticalLayout implements View {

	@WebServlet(value = "/*", asyncSupported = true)
	//@VaadinServletConfiguration(productionMode = false, ui = TelaUI.class)
	public static class Servlet extends VaadinServlet {
				
		@Override
		protected void servletInitialized() throws ServletException {
			
		}
	}
	
	
	//int cont =1;
	Navigator navigator;
	protected static final String MAINVIEW = "main";

	@Override
	protected void init(VaadinRequest request) {

//------------ mudança de tela com uma quase navegação pra organizar melhor as telas--utilizando apenas uma UI
		getPage().setTitle("tela UI");
//		navigator = new Navigator(this,this);
//		
//		navigator.addView("", new Tela2());
//		navigator.addView(MAINVIEW,new Tela2());
		
		
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(new Tela2());
		

//------------ FIM  mudança de tela com uma quase navegação pra organizar melhor as telas--utilizando apenas uma UI		
		
//----------------------------bind e table--------------------		
//		Pessoa pessoa = new Pessoa("","");
//		BeanItem<Pessoa> item = new BeanItem<Pessoa>(pessoa);
//		
//	
//		TextField nome = new TextField("Nome",item.getItemProperty("nome"));
//		nome.setImmediate(true);
//		
//		TextField idade = new TextField("idade", item.getItemProperty("idade"));
//		idade.setImmediate(true);
//		
//		VerticalLayout vltab = new VerticalLayout();
//		
//		Table tabela = new Table("Tabela de Pessoas");
////		tabela.setWidth("250px");
//		tabela.addContainerProperty("Nome", String.class, null);
//		tabela.addContainerProperty("idade", String.class, null);
//		tabela.setImmediate(true);
//		vltab.addComponent(tabela);
//		tabela.setPageLength(tabela.size());
//		tabela.setSelectable(true);
//		tabela.setEditable(true);
//		
//		
//
//		Button listar = new Button("Listar");
//				
//				
//			listar.addClickListener(new ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				vltab.removeComponent(tabela);
//				tabela.addItem(new Object[]{pessoa.getNome(),pessoa.getIdade()},cont);
//				cont++;
////				nome.setValue("");
////				idade.setValue("");
//				tabela.setPageLength(tabela.size());
//				vltab.addComponent(tabela);
//				
//			}
//		});
//		
//		
//
//		Button mostrar = new Button("Pessoa nome");
//		mostrar.addClickListener(new Button.ClickListener() {
//			public void buttonClick(ClickEvent event) {
//				layout.addComponent(new Label("nome = "+pessoa.getNome()));
//			}
//		});
//		
//		
//		layout.addComponent(nome);
//		layout.addComponent(idade);
//		layout.addComponent(listar);
//		layout.addComponent(mostrar);
//		layout.addComponent(vltab);
		
//-------------------------------------fim table e bind--------------------		
		
		
//--------------------------------------------------------------------------------		
		//--------------------menuBar com evento
		
	/*	MenuBar barmenu = new MenuBar();
		
		
		final Label selection = new Label("-");
		
		MenuBar.Command mycommand = new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				selection.setValue("Ordered a " +
						selectedItem.getText() +
						" from menu.");
				
			}
		};
		
		
		// A top-level menu item that opens a submenu
		MenuItem drinks = barmenu.addItem("Beverages", FontAwesome.USER, null);
		// Submenu item with a sub-submenu
		MenuItem hots = drinks.addItem("Hot", null, null);
		hots.addItem("Tea",	null, mycommand);
		hots.addItem("Coffee",	null,null);//, mycommand);
		// Another submenu item with a sub-submenu
		MenuItem colds = drinks.addItem("Cold", null, null);
		colds.addItem("Milk", null,null);// mycommand);
		colds.addItem("Weissbier", null,null);// mycommand);
		// Another top-level item
		MenuItem snacks = barmenu.addItem("Snacks", null, null);
		snacks.addItem("Weisswurst", null,null);// mycommand);
		snacks.addItem("Bratwurst", null,null);// mycommand);
		snacks.addItem("Currywurst", null,null);// mycommand);
		// Yet another top-level item
		MenuItem servs = barmenu.addItem("Services", null, null);
		servs.addItem("Car Service", null,null);//, mycommand);
		
		
		//----------------------fim do menuBar--------
		
		
		
		getPage().setTitle("Pagina");
		
		layout.setSpacing(true);
		layout.addComponent(barmenu);
		layout.addComponent(selection);
		
		*/
		
	//-----------------------------------------------------------------	
		
	
	/*	
		this.setSizeFull();
		
		HorizontalLayout geral= new HorizontalLayout();
		
		Panel painel = new Panel("Alterar Senha");
		painel.setWidth("350px");
		painel.setHeight("300px");
		painel.setIcon(FontAwesome.KEY);
		
		VerticalLayout vlinternoMaior= new VerticalLayout();
		vlinternoMaior.setSpacing(true);
		VerticalLayout vlinterno1= new VerticalLayout();
		vlinterno1.setSizeFull();

		
		TextField senhaAtual = new TextField("Senha Atual");
		senhaAtual.setWidth("200px");
		TextField novaSenha = new TextField("Nova Senha(Min. 8 Caracteres)");
		novaSenha.setWidth("200px");
		TextField repitaNovaSenha = new TextField("Repita a Nova Senha");
		repitaNovaSenha.setWidth("200px");
		
		Button salvar = new Button("Salvar");
		
			salvar.addClickListener( new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					navigator.addView("tela2", new Tela2());
					navigator.navigateTo("tela2");
					
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
		geral.setSizeFull();
		geral.setComponentAlignment(painel, Alignment.MIDDLE_CENTER);
		
		this.setContent(geral);
	*/	
	
	//--------------------tela de alteração de senha com validação
	/*	
		this.setSizeFull();
		
		Panel painel = new Panel("Alterar Senha");
		painel.setWidth("350px");
		painel.setHeight("300px");
		painel.setIcon(FontAwesome.KEY);
		
		VerticalLayout vlinternoMaior= new VerticalLayout();
		vlinternoMaior.setSpacing(true);
		
		
		
		PasswordField senhaAtual = new PasswordField("Senha Atual");
		senhaAtual.setWidth("200px");
		final PasswordField novaSenha = new PasswordField("Nova Senha(Min. 8 Caracteres)");
		novaSenha.setWidth("200px");
		PasswordField repitaNovaSenha = new PasswordField("Repita a Nova Senha");
		repitaNovaSenha.setWidth("200px");
		
		novaSenha.addValueChangeListener(new ValueChangeListener() {
			
			@Override
			public void valueChange(ValueChangeEvent event) {
				if(novaSenha.getValue().length() < 8){
					Notification mgs = new Notification("");
					mgs.setHtmlContentAllowed(true);
					mgs.show("Minimo 8 carateres!", "", Notification.Type.WARNING_MESSAGE);
					mgs.setPosition(Position.BOTTOM_CENTER);
					mgs.setDelayMsec(2000);
				}
				
			}
		});
		
		
		
		
		
		Button salvar = new Button("Salvar");
		
			salvar.addClickListener( new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					boolean confirmação = false;
					boolean btamanho= false;
					boolean bLetrasNumero = false;
			

					if(!(novaSenha.getValue().equals(repitaNovaSenha.getValue()))){			
						Notification mgs = new Notification("Senhas Diferentes");
						mgs.setHtmlContentAllowed(true);
						mgs.show("As senha não conferem","Senhas Diferentes",Notification.Type.WARNING_MESSAGE);
						mgs.setPosition(Position.BOTTOM_LEFT);
						mgs.setDelayMsec(2000);
					}
					
					else{
					
					
						if(novaSenha.getValue().length() >= 8){
							btamanho= true;
						}
										
											
						if(conferirPassword(novaSenha)){
							bLetrasNumero = true;
						}
					
									
						if(btamanho && bLetrasNumero){
//							salvarSenha(senhaAtual.getValue().toString(),novaSenha.getValue().toString());
							
							System.out.println("Salvei a senha");
						}
						
					
						
						else{
							
													
							if(!btamanho && bLetrasNumero){
								Notification.show("A senha não contem no mínimo 8 caracteres!");
							}
							
							else if(btamanho&& !bLetrasNumero){
								Notification.show("A senha deve conter letras e numeros ");
	
							}
							
						}
					
					}
					
					
						
				}
			});
		
		
		vlinternoMaior.addComponents(senhaAtual,novaSenha,repitaNovaSenha,salvar);
		vlinternoMaior.setSizeFull();
		vlinternoMaior.setComponentAlignment(senhaAtual, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(novaSenha, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(repitaNovaSenha, Alignment.MIDDLE_CENTER);
		vlinternoMaior.setComponentAlignment(salvar, Alignment.MIDDLE_CENTER);
		painel.setContent(vlinternoMaior);
		
		layout.addComponent(painel);
		layout.setSizeFull();
		layout.setComponentAlignment(painel, Alignment.MIDDLE_CENTER);

	
	
	
	}
	public boolean conferirPassword(PasswordField senha){
		String strSenha = senha.getValue().toString();
		char[] vetorSenha = strSenha.toCharArray();
		char[] vetorLetras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] vetorNumber ={'0','1','2','3','4','5','6','7','8','9'}; 
		boolean resposta = false;
		boolean bletras =false;
		boolean bnumero =false;
		
		int i=0;
		int l ;
		int n;
		
			while(i<vetorSenha.length){
			
				l=0;
				while(l< vetorLetras.length && !bletras){
							
					if(vetorSenha[i]==vetorLetras[l])
						bletras = true;
					
					l++;
				}
				
				n=0;
				while ( n<vetorNumber.length && !bnumero) {
											
						if(vetorSenha[i]==vetorNumber[n])
							bnumero = true;
									
					n++;
				}
				
				i++;
			}
			
			if(bletras && bnumero){
				resposta = true;
			}
		
			return resposta;
	}
*/	
//----------------------- fim cadastrar novas senha com validação

/* simp
@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = SimpAplication.class)
	public static class MyServlet extends VaadinServlet{
		
		@Override
		protected void servletInitialized() throws ServletException {
			getService().setSystemMessagesProvider(new SystemMessagesProvider() {
				
				@Override
				public SystemMessages getSystemMessages(
						SystemMessagesInfo systemMessagesInfo) {
					
					CustomizedSystemMessages messages = new CustomizedSystemMessages();
					messages.setCommunicationErrorCaption("Erro comum");
					messages.setCommunicationErrorMessage("Mal erro");
					messages.setCommunicationErrorNotificationEnabled(true);
					messages.setCommunicationErrorURL("http://www.mpms.mp.br/");
					
					messages.setAuthenticationErrorCaption("Errro Autenticação");
					messages.setAuthenticationErrorMessage("Servidor não encontrado!");
					messages.setAuthenticationErrorNotificationEnabled(true);
					messages.setAuthenticationErrorURL("http://www.mpms.mp.br/");
					
					messages.setCookiesDisabledCaption("Titulo cookies");
					messages.setCookiesDisabledMessage("Mensagem cookies");
					messages.setCookiesDisabledNotificationEnabled(true);
					messages.setCookiesDisabledURL("http://www.mpms.mp.br/");
					
					messages.setInternalErrorCaption("Titulo erro Interno");
					messages.setInternalErrorMessage("Texto do erro interno");
					messages.setInternalErrorNotificationEnabled(true);
					messages.setInternalErrorURL("http://www.mpms.mp.br/");
					
					messages.setOutOfSyncCaption("Titulo outofsync");
					messages.setOutOfSyncMessage("texto outofsync");
					messages.setOutOfSyncNotificationEnabled(true);
					messages.setOutOfSyncURL("http://www.mpms.mp.br/");
					
					
					
					
					
					

					return messages;
				}
			});
			super.servletInitialized();
		}
	}
	

*/
	
	//----------------------window de tela
		/*
		Window subWindow = new Window("SubWindow");
		Button fechar = new Button("Fechar",new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				subWindow.close();
				
			}
		});*/
		
		
		
//		Button janela = new Button("Sub-Janela", new ClickListener() {
//			
//			@Override
//			public void buttonClick(ClickEvent event) {
//				//abre a janela na UI
//				//addWindow(subWindow);
////				navigator.navigateTo(alterar);
//				
//			}
//		});
		/*
		subWindow.setWidth("200px");
		subWindow.setHeight("200px");
		
		VerticalLayout subcontent = new VerticalLayout();
		subcontent.setMargin(true);
		subWindow.setContent(subcontent);
		
		subcontent.addComponent(new Label("Minha Label"));
		subcontent.addComponent(fechar);
		subWindow.center();
		*/
	
		
		
		
		//abre a janela na UI
//		addWindow(subWindow);
		
		
	//---------------------fim de window tela
	
	}

}
