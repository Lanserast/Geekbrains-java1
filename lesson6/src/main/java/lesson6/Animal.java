package lesson6;

public class Animal {
    private String name, type;
    private double RunLimit, SwimLimit, JumpLimit;
    private static int GLOBAL_SEQUENCE_ID = 1;
    private int uid;

    //Создание конструктора
    Animal(String type, String name, double RunLimit, double SwimLimit, double JumpLimit) {
        this.type = type;
        this.name = name;
        this.uid = GLOBAL_SEQUENCE_ID;
        GLOBAL_SEQUENCE_ID++;
        if (RunLimit >= 0) {
            this.RunLimit = RunLimit;
        }

        if (SwimLimit >= 0) {
            this.SwimLimit = SwimLimit;
        }

        if (JumpLimit >= 0) {
            this.JumpLimit = JumpLimit;
        }
    }


    public boolean Run(double val){
        return val > 0 && val <= RunLimit;
    }
    public boolean Swim(double val){
        return val > 0 && val <= SwimLimit;
    }
    public boolean Jump(double val){
        return val > 0 && val <= JumpLimit;
    }

    public int getUid(){
        return this.uid;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }




}