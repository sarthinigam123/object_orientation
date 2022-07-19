package objects;

public class Age {
    private int age;

    public Age(int age){
        if(age>0){
            this.age=age;
        }
        else this.age = 0;
    }

    public void onlyIncreaseAge(int addAge){
        if(addAge > 0){
            this.age += addAge;
        }
    }
}
