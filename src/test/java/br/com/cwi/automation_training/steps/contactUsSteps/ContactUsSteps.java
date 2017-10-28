package br.com.cwi.automation_training.steps.contactUsSteps;

import br.com.cwi.automation_training.pages.contactPage.ContactUsPage;
import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;

public class ContactUsSteps {
	
	@Dado ("que estou na homepage site \"(.*)\"")
	public void iniciarHomePage(String url){
		TestRule.openApplicationChrome(url);
	}	
	
	@Quando ("clico em \"Contact US\"")
	public void clicarEmContactUS(){
		ContactUsPage acessarTela = new ContactUsPage();
		acessarTela.acessarContactUs();
	}
	
	@Quando ("insiro informacao valida no campo \"Subject Heading\"")
	public void preencherCampoSubjectHeading(){
		ContactUsPage campoSubjectHeading = new ContactUsPage();
		campoSubjectHeading.preencherCampoSubjectHeading();		
	}
	/**
	@E ("insiro informação válida no campo \"Email Address\"")
	public void{
		
	}
	@E ("insiro informação válida no campo \"Order reference\"")
	public void{
		
	}
	
	@E ("anexo um arquivo PDF no campo \"Attach File\"")
	public void{
		
	}
	@E ("insiro informação válida no campo \"Message\"")
	public void{
		
	}
	
	@E ("clico no botão \"Send\"")
	public void{
		
	}
	
	@Entao ("deve apresentar pagina com a mensagem \"Your message has been successfully sent to our team.\"")
	public void{
		
	} */
}
