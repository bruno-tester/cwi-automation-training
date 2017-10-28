#language: pt
#encoding: iso-8859-1
Funcionalidade: Contact US

  @treinamentoDesafio
  Cenario: Enviar mensagem
    Dado que estou na homepage site "http://automationpractice.com"
    Quando clico em "Contact US"
    Quando insiro informacao valida no campo "Subject Heading"
    E insiro informação válida no campo "Email Address"
    E insiro informação válida no campo "Order reference"
    E anexo um arquivo PDF no campo "Attach File"
    E insiro informação válida no campo "Message"
    E clico no botão "Send"
    Entao deve apresentar pagina com a mensagem "Your message has been successfully sent to our team."
    
    Entao é exibido a tela "CUSTOMER SERVICE - CONTACT US"

    
 