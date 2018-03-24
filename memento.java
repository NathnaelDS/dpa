import java.util.ArrayList;
import java.util.List;


class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}


class Orignator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}


class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}


public class HereLiesAMementoPattern {
    public static void main(String[] args){
        Orignator originator = new Orignator();
        CareTaker careTaker = new CareTaker();

        orignator.setState("The FIRST State");
        orignator.setState("The SECOND State");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("The THIRD State");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("The FOURTH State");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
        
    }
}