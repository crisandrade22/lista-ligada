import org.example.Lista;

import java.util.Random;

public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Random random = new Random();
        do {
            if(random.nextInt(2) == 1) {
                int inserido = random.nextInt(10);
                lista.insereInicio(inserido);
                System.out.println(inserido + " entrou.");
            } else if (!lista.estaVazia()){
                System.out.println(lista.removeInicio() + " saiu.");
            }
            System.out.println(lista);

        }while(!lista.estaVazia());
        for(int i =1; i<=4; i++) {
            lista.insereFim(i);
            System.out.println("For: " + lista);
        }
        while(!lista.estaVazia()) {
            System.out.println(lista.removeFim() + " saiu fim.");
            System.out.println(lista);
        }
    }
}
