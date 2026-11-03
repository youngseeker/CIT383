class Student {
    private double height;                       // encapsulated member field

    public void setHeight(double h) {            // mutator
        if (h > 0) height = h;
    }
    public double getHeight() {                  // accessor
        return height;
    }

    public static class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setHeight(1.75);
        System.out.println(s.getHeight());
    }
}
}