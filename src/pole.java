import java.util.ArrayList;

public class pole {
    private int velikostPole;
    private int zabrano;
    private ArrayList<Flower> rostliny;
    private ArrayList<String> typyRostlin;

    public pole() {
        velikostPole = 1000000;
        zabrano = 0;
    }
    public boolean pridejRostlinu(Flower f){
        if (zabrano + f.getNeededArea() < velikostPole){
            if (typyRostlin.size() < 5){
                rostliny.add(f);
                for (int i = 0;i< typyRostlin.size();i++){
                    if (typyRostlin.get(i).equals(f.getName())){
                        return true;
                    }
                }
                typyRostlin.add(f.getName());
                return true;
            }
            for (int i = 0;i< typyRostlin.size();i++){
                if (typyRostlin.get(i).equals(f.getName())){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    public boolean odeberRostlinu(Flower f){
        return false;
    }
}
