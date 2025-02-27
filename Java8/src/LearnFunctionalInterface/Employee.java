package LearnFunctionalInterface;

class Test {
    public static void main(String[] args) {
        Employee employee =() -> "hello";
        System.out.println(employee.Hello());
    }
}

@FunctionalInterface
public interface Employee {
    public String Hello();
}
