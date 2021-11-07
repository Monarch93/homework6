package org.example;

public class Animals implements Cloneable {
    protected String name;
    protected int swims;
    protected int run;

    @Override
    public String toString() {
        return  "Зверь: '" + name + ", Может проплыть " + swims + "м." + ", Может пробежать " + run + "м.";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.name + " справился с дистанцией " + distance + "м.");
        }
    }

    protected void swims(int distance) {
        if (swims >= distance) {
            System.out.println(this.name + " преодолел заплыв " + distance + "м.");
        }
    }

}
