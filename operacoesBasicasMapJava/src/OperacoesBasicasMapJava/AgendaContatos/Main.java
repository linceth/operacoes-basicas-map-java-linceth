package OperacoesBasicasMapJava.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();
        contatos.adicionarContato("Marcos", 889976543);
        contatos.adicionarContato("Marcos", 889954678);
        contatos.adicionarContato("Sofia", 654322145);
        contatos.adicionarContato("Tereza", 887651234);
        contatos.adicionarContato("Thiago", 889973240);
        contatos.adicionarContato("Marcos", 889);

        contatos.exibirContatos();
        contatos.removerContato("Thiago");
        contatos.exibirContatos();
    }
}
