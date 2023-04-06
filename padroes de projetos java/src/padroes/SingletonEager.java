package padroes;

//Objetivo: criar uma instância da classe de forma imediat na inicialização da classe,
//antes mesmo de sua primeira utilização. [variação do padrão Singleton]
public class SingletonEager {

    private SingletonEager(){}

    private static SingletonEager instance = new SingletonEager();

    public static SingletonEager getInstance(){
        return instance;
    }
}
