package padroes;

//Padrão comum em projetos que necessitam a garantia da criação
//de uma instância em ambientes multitread [variação do padrão Singleton]
public class SingletonLazyHolder {

    private SingletonLazyHolder(){}

    //classe interna(inner class)
    private static class IntanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance(){
        return IntanceHolder.instancia;
    }
}
