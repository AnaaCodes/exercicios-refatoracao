package refatoracoes.composicao;

public class SplitVariable {

    public SplitVariable(float height, float width) {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);

        final double area = height * width;
        System.out.println(area);
    }
}
