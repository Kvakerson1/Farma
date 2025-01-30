import java.util.ArrayList;

public class Stodola {
    private int velikostMalaZvirata;
    private int velikostVelkaZvirata;
    private ArrayList<Animal> velkaZvirata;
    private ArrayList<Animal> malaZvirata;

    public Stodola() {
        velikostMalaZvirata = 10;
        velikostVelkaZvirata = 10;
    }
    public void zvecVelikost(boolean velikost,int pocet){
        if (velikost){
            velikostVelkaZvirata += pocet;
        }else{
            velikostMalaZvirata += pocet;
        }
    }
    public void pridejZvire(Animal a){
        if (a.getSize() == Size.BIG && velkaZvirata.size() < velikostVelkaZvirata){
            velkaZvirata.add(a);
        }else if (a.getSize() == Size.SMALL && malaZvirata.size() < velikostMalaZvirata){
            malaZvirata.add(a);
        }
    }
    public boolean odstranZvire(String name){
        for (int i = 0; i < velkaZvirata.size();i++){
            if (velkaZvirata.get(i).getName().equals(name)){
                velkaZvirata.remove(i);
                return true;
            }
        }
        for (int i = 0; i < malaZvirata.size();i++){
            if (malaZvirata.get(i).getName().equals(name)){
                malaZvirata.remove(i);
                return true;
            }
        }
        return false;
    }
}
