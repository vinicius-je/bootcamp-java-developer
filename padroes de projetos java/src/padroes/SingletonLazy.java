package padroes;

//Objetivo: garantir que a instância da classe seja criada somente quando necessário
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}
    //Somente cria a instância quando esse método for invocado
    public static SingletonLazy getInstance(){
        if(instance == null)
            instance = new SingletonLazy();

        return  instance;
    }
}
