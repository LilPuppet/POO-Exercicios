public class Matriz {
    private float matriz[][] = new float[2][2];

    public Matriz(float n1, float n2, float n3, float n4) {
        matriz[0][0] = n1;
        matriz[0][1] = n2;
        matriz[1][0] = n3;
        matriz[1][1] = n4;
    }

    public float determinante(){
        return ((matriz[0][1] * matriz[1][0])-(matriz[0][0] * matriz[1][1]));
    }

    public String toString() {
        return "Matriz\n "+ matriz[0][0] +" "+matriz[0][1] +"\n "+ matriz[1][0] +" "+matriz[1][1];
    }
    
}
