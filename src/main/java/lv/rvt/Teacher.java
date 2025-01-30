package lv.rvt;

public class Teacher extends Person {

    public Teacher(String name, String address, int salary){
        super(name, address, salary);
    }

    @Override
    public String toString(){
        return super.getName() + "\n\t" + super.getAddress() + "\n\tsalary " + super.getSalary() + " euro/month";
    }
}