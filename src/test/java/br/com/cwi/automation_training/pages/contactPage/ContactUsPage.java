package br.com.cwi.automation_training.pages.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.cwi.automation_training.util.TestRule;
import io.github.marcoslimaqa.sikulifactory.FindBy;

public class ContactUsPage extends ContactUsElementoMap{
	
	public ContactUsPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void acessarContactUs() {
		
		clicar.click();	
	}
	
	public void preencherCampoSubjectHeading() {
		//Select oSelect = new Select("Customer service");
		Select dropdown = new Select(driver.findElement(By.id("SubjectHeading")));
		dropdown.selectByIndex(2);
	}
	
}
