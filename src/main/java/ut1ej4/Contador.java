package ut1ej4;

public class Contador {
    public int MAX_COUNT = 50;
    public int incremento = 1;
    public int contador = 1;

    public void mostrarContadorUsandoWhile(){
        while(MAX_COUNT >= contador){
            System.out.println(contador);
            contador += incremento;
        }
        contador = 0;
    }
    public void mostrarContadorUsandoDoWhile(){
        do{
            System.out.println(contador);
            contador += incremento;
        }while(MAX_COUNT >= contador);
        contador = 0;
    }
    public void mostrarContadorUsandoFor(){
        for(contador = 1;  contador <= MAX_COUNT;){
            System.out.println(contador);
            contador += incremento;
        }
        contador = 0;
    }
}
