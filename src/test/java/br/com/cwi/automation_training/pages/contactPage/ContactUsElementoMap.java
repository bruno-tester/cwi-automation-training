package br.com.cwi.automation_training.pages.contactPage;

import org.openqa.selenium.WebElement;

import br.com.cwi.automation_training.pages.BasePage;
import org.openqa.selenium.support.FindBy;

public class ContactUsElementoMap extends BasePage {
	
	@FindBy(id = "contact-link")
	protected WebElement clicar;
	
	protected WebElement id_contact;
	
	
}
