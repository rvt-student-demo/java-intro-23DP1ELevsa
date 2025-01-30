package lv.rvt;

public class Student extends Person {
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
    }

    public void study() {
        this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString(){
        return super.getName() + "\n\t" + super.getAddress() + "\n\tStudy credits " + this.credits;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        } 

        if (!(compared instanceof Student)) {
            return false;
        }

        Student comparedStudent = (Student) compared;

        if (this.name.equals(comparedStudent.getName())) {
            return true;
        }
        return false;
    }
}        