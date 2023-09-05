package September05;

public class JennySecretMessageDebug {
    public static String greet(String name) {
        // moved if statement higher so not unreachable return
        if (name.equals("Johnny")){
            return "Hello, my love!";
        }
        // unreachable return, reformatted to output properly
        return String.format("Hello, " + name + "!");
    }
}

// bad code:
public class Greeter {
    public static String greet(String name) {

        return String.format("Hello, %s!", name);

        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
    }
}
