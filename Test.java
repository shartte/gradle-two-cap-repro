public class Test {
    public static void main(String[] args) {
        for (var line : System.getProperty("java.class.path").split(java.io.File.pathSeparator)) {
            System.out.println(" - " + line);
        }
    }
}
