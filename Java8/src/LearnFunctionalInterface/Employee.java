package LearnFunctionalInterface;

class Test {
    public static void main(String[] args) {
        Employee employee =() -> System.out.println("hello");
        employee.Hello();
    }
}

@FunctionalInterface
public interface Employee {
    public void Hello();
}
