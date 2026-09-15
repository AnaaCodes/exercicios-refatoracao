package refatoracoes.generalizacao;

// 1. O campo e os acessores sobem para a SuperClass
class SuperClass {
    private float health;

    public float getHealth() {
        return this.health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
}

// 2. A subclasse mantém apenas o comportamento específico dela
public class PullUpField extends SuperClass {

    public void publicMethod() {
        System.out.println("PullUpField");
    }
}
