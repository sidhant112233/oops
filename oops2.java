public class oops2 {
    public static void main(String[] args) {
        a f = new a();
        f.set();
    }

}

class a {
    int a = 4, f = 1;

    void set() {
        for (int i = 1; i <= a; i++) {

            f = f * i;
        }
        System.out.println(f);
    }

}
