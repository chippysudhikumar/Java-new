public interface Abstract {
    void calling();
    void message();
}

class Vedio implements Abstract{
   public void calling(){
        System.out.println("ongoing vedio calls");
    }

    public void message(){
        System.out.println("they are messaging");
    }
}

class Ongoing implements Abstract{
    public void calling(){
        System.out.println("ongoing audio calls");
    }

    public void message(){
        System.out.println("they patti messaging");
    }
}



