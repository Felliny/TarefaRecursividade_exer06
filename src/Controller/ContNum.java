package Controller;

public class ContNum {

    public ContNum(){
        super();
    }

    public int ContaNumIgual(int n, int v){
        if (n < 10 ){ //condição de parada
            if (n == v){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int quantidade= ContaNumIgual(n / 10, v); //chamada da recursiva

            if (n % 10 == v){
                return quantidade + 1;
            }
            else {
                return quantidade;
            }

        }
    }
}
