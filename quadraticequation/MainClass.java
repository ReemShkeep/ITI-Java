package quadraticequation;

public class MainClass {

    public static void main(String[] args) {
        //float a = 1, b = 5, c =2;
        Float[] floatArr;
        //floatArr = new Float[]{1f, 5f, 2f};
        floatArr = new Float[]{5f, 3f, 2.2f};
        //floatArr = new Float[]{1.9f, 2.1f, 2.6f};
        //int a = 10, b = 3, c =6;
        QuadraticEquation q = new QuadraticEquation();
        q.apply(floatArr);
    }
}
