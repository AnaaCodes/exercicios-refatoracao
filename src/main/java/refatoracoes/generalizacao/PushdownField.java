package refatoracoes.generalizacao;

// A SuperClass fica limpa, sem o campo genérico que não pertencia a todas as subclasses..
class SuperClass {
    // Apenas atributos e métodos genuinamente comuns a todas as subclasses
}

//O campo específico vão para as subclasse correta!
public class PushdownField extends SuperClass {

    private float health;

    public void publicMethod() {
        System.out.println("PushdownField");
    }

    public float getHealth() {
        return this.health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
}
