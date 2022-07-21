package encapsulation;

public class Age {
    private int age;
    //TODO
    /*
    dont check the age>0 repeatedly, create a isValidate func for this
    also look for lombok library
     */
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
