mport java.util.Scanner;

public class Main {

    // ==========================================
    // 1. POLYMORPHIC DRAWING STRUCTURES
    // ==========================================
    static class RawSketch {
        String shapeName;

        public RawSketch(String shapeName) {
            this.shapeName = shapeName;
        }

        public void refineDrawing() {
            System.out.println("Processing raw sketch lines...");
        }
    }

    static class BoxSketch extends RawSketch {
        public BoxSketch() {
            super("Box");
        }
        public void refineDrawing() {
            System.out.println("\n--- [AI Refined Art: Clean Box Frame] ---");
            System.out.println("+---------+");
            System.out.println("|         |");
            System.out.println("|         |");
            System.out.println("+---------+");
        }
    }

    static class TriangleSketch extends RawSketch {
        public TriangleSketch() {
            super("Triangle");
        }

        public void refineDrawing() {
            System.out.println("\n--- [AI Refined Art: Clean Triangle] ---");
            System.out.println("    ^    ");
            System.out.println("   / \\   ");
            System.out.println("  /   \\  ");
            System.out.println(" /     \\ ");
            System.out.println("---------");
        }
    }

    static class DiamondSketch extends RawSketch {
        public DiamondSketch() {
            super("Diamond");
        }

        public void refineDrawing() {
            System.out.println("\n--- [AI Refined Art: Clean Diamond] ---");
            System.out.println("    ^    ");
            System.out.println("   / \\   ");
            System.out.println("  /   \\  ");
            System.out.println("  \\   /  ");
            System.out.println("   \\ /   ");
            System.out.println("    v    ");
        }
    }

    // ==========================================
    // 2. OVERLOADED RENDER ENGINES
    // ==========================================
    public static void generateArt(RawSketch sketch) {
        sketch.refineDrawing(); 
    }

    public static void generateArt(RawSketch sketch, int scale) {
        System.out.println("\n[System Alert] Simulating custom scaling view to " + scale + "x dimension...");
        sketch.refineDrawing();
    }

    // ==========================================
    // 3. MAIN INTERACTIVE METHOD
    // ==========================================
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 🌟 PERSONALIZATION LAYER (College & Student Identity Verification Blocks)
        System.out.println("========================================================");
        System.out.println("       CHAITANYA BHARATHI INSTITUTE OF TECHNOLOGY       ");
        System.out.println("               PRODDATUR, ANDHRA PRADESH                ");
        System.out.println("   DEPT OF COMPUTER SCIENCE & ENGINEERING Mini-Project  ");
        System.out.println("========================================================");
        
        System.out.print("Please enter your Student Name: ");
        String studentName = input.nextLine();
        
        System.out.print("Please enter your B.Tech Roll Number: ");
        String rollNumber = input.nextLine();
        
        System.out.println("\n[System Authentication Success]");
        System.out.println("Developer Context Initialized: " + studentName + " (" + rollNumber + ")");
        System.out.println("========================================================");

        boolean running = true;

        while (running) {
            System.out.println("\n--- Drawing Operations Dashboard ---");
            System.out.println("1. Submit Rough Box Layout");
            System.out.println("2. Submit Rough Triangle Layout");
            System.out.println("3. Submit Rough Diamond Layout");
            System.out.println("4. Exit Assistant Application");
            System.out.print("Enter selection (1-4): ");

            int choice = 0;
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                System.out.println("[Error] Invalid entry type! Please type a numeric option.");
                input.next(); 
                continue;
            }

            if (choice == 4) {
                System.out.println("\nClosing log session for Registry context: " + rollNumber);
                System.out.println("Execution terminated safely. Good bye!");
                running = false;
                continue;
            }

            RawSketch selectedSketch = null;
            
            switch (choice) {
                case 1: selectedSketch = new BoxSketch(); break;
                case 2: selectedSketch = new TriangleSketch(); break;
                case 3: selectedSketch = new DiamondSketch(); break;
                default:
                    System.out.println("[Warning] Out of range assignment slot. Select 1 to 4.");
                    continue;
            }

            System.out.println("\nChoose rendering scale processing window:");
            System.out.println("1. Standard View Layout");
            System.out.println("2. Zoomed 2x Scale Output View");
            System.out.print("Selection: ");
            
            int scaleChoice = input.nextInt();
            
            if (scaleChoice == 2) {
                generateArt(selectedSketch, 2); 
            } else {
                generateArt(selectedSketch);    
            }
        }
        input.close();
    }
}
