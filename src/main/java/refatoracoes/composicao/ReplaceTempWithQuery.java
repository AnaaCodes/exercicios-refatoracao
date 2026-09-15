package refatoracoes.composicao;

public class ReplaceTempWithQuery {

    double calculateTotal(int quantity, double itemPrice) {
        double discountRate = getBasePrice(quantity, itemPrice) > 1000 ? 0.95 : 0.98;
        return getBasePrice(quantity, itemPrice) * discountRate;
    }

    private double getBasePrice(int quantity, double itemPrice) {
        return quantity * itemPrice;
    }
}
