package refatoracoes.generalizacao;

class SuperClass {
    private float health;

    public float getHealth() {
        return this.health;
    }

    public void setHealth(float health) {
        this.health = health;
    }
}

public class PullUpMethod extends SuperClass {

    public void publicMethod() {
        System.out.println("PullUpMethod");
    }
}
