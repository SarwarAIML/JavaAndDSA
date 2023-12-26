package miscellaneous.singalton;

public class Singalton {

    private static Singalton singalton;

    private Singalton(){

    }
    public static Singalton getSIngalton(){
        if (singalton == null){
            synchronized (Singalton.class){
                if (singalton == null){
                    singalton = new Singalton();
                }
            }
        }
        return singalton;
    }

}
