public class HelloWorld {
  public static void main(String args[]) {
    String recipient = "World";
    if (args.length >= 1) {
      recipient = args[0];
    }

    System.out.println("Hello " + recipient + "!");
  }
}
