import org.apache.camel.spring.Main;

public class MyApplication {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("OSGI-INF/blueprint/camel-context.xml");
        System.out.println("Start camel context");

        main.start();

    }
}