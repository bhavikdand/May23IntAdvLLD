package access_modifiers.package_1;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Bhavik";
        // st.age = 25; <- age is private
        st.email = "b@d.com";
        st.psp = 34.04d;
    }
}
