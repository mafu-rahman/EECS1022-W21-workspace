package eecs1022.tutorial.counter.model;

public class Counter {
    private int value;

    public Counter(int value){
        this.value = value;
    }

    public int getValue(){
        return  this.value;
    }

    public void increment(){
        this.value++;
    }

    public void decrement() {
        this.value--;
    }
}
