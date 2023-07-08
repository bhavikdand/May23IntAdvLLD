package designpatterns.prototype;

public class IntelligentStudent extends Student {

    public int iq;

    public IntelligentStudent(int age, String name, String email, String university, int iq) {
        super(age, name, email, university);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent original) {
        super(original);
        this.iq = original.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
