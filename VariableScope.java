public class VariableScope {
    // Global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount from main
        System.out.println("Global Count (from main): " + globalCount);

        // Call showScope method
        showScope();
    }

    public static void showScope() {
        // Local variable
        int localCount = 50;

        // Print globalCount from showScope
        System.out.println("Global Count (from showScope): " + globalCount);

        // Print localCount from showScope
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
