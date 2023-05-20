package RevsionConstructor;
public class TestClass {
    private String testData;
    public TestClass(String testData) {
    this.testData = testData;
    }
    public TestClass() {
    this("Test karke deko"); 
    }
    public static void main(String[] args) {
        TestClass testClass1 = new TestClass("Test karo Data ko");
        TestClass testClass2 = new TestClass();
    }
   }
