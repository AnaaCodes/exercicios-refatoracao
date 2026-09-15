package refatoracoes.generalizacao;


class SuperClass {
    // Métodos gerais compartilhados por todas as subclasses ficam aqui
}

public class PushDownMethod extends SuperClass {

    public void publicMethod() {
        System.out.println("PushDownMethod");
    }
}
