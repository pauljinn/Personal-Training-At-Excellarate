import java.util.Properties;

class Test{
    public static void main(String[] args){
        System.out.println("Starting of java programming in Docker");
        printSystemProperties();
    }

    public static void printSystemProperties(){
        System.out.println("System properties");
        Properties props = System.getProperties();
        System.out.println("Properties " + props);
    }
}