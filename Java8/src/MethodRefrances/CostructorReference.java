package MethodRefrances;

class Sample {
    Sample() {
        System.out.println("Sample class construction and execution");
    }
}

interface Interf {
    public Sample get();
}

public class CostructorReference {
    public static void main(String[] args) {
        Interf i = Sample::new;
        Sample s = i.get();
    }
}
