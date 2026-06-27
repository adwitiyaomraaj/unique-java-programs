


import java.io.*;
import java.util.*;
import java.awt.Desktop;

class gmail_g {
    
    static final String FILE_NAME = "gmail_g.csv";
    
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        while (true) {
            showMenu();
            String choice = sc.nextLine().trim();
            
            switch (choice) {
                case "1": login(); break;
                case "2": createAccount(); break;
                case "3": 
                    
                    System.out.println("✅ Program Ended."); 
                    sc.close(); 
                    
                    return;
                default: 
                    System.out.println("⚠️ Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }

    
    static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Login");
        System.out.println("2. Create Account");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    
    static void login() {
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            System.out.println("⚠️ No accounts found. Please create an account first.");
            return;
        }

        try {
            List<String[]> users = readUsers();
            System.out.print("Enter Gmail: ");
            String gmail = sc.nextLine().trim();

            String[] userData = findUser(users, gmail);
            if (userData == null) {
                System.out.println("❌ Gmail not found. Returning to home.");
                return;
            }

            boolean loginSuccess = false;
            while (!loginSuccess) {
                System.out.print("Enter Password: ");
                String password = sc.nextLine().trim();

                if (password.equals(userData[1])) {
                    System.out.println("✅ Login Successful!");
                    openCSV();
                    loginSuccess = true;
                } else {
                    handleWrongPassword(users, userData);
                    break; 
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    
    static void handleWrongPassword(List<String[]> users, String[] userData) throws IOException {
        System.out.println("\n❌ Password incorrect. Choose an option:");
        System.out.println("1. Retype Password");
        System.out.println("2. Forgot Password");
        System.out.println("3. Back to Home");
        System.out.print("Enter choice: ");
        String opt = sc.nextLine().trim();

        switch (opt) {
            case "1": login(); break; 
            case "2": forgotPassword(users, userData); break;
            case "3": return;
            default: System.out.println("⚠️ Invalid option. Returning to home.");
        }
    }

    
    static void forgotPassword(List<String[]> users, String[] userData) throws IOException {
        System.out.print("Enter Backup Key: ");
        String backupKey = sc.nextLine().trim();

        if (backupKey.equals(userData[2])) {
            System.out.println("🔑 Backup key correct. Your old password is: " + userData[1]);
            System.out.println("Do you want to continue with old password or change to new password?");
            System.out.println("1. Continue with old password");
            System.out.println("2. Change to new password");
            System.out.print("Enter choice: ");
            String ch = sc.nextLine().trim();
            if (ch.equals("2")) {
                String newPass = "";
                while (true) {
                    System.out.print("Enter New Password: ");
                    newPass = sc.nextLine().trim();
                    if (isValidPassword(newPass)) break;
                    System.out.println("Password invalid. Try again.");
                }

                
                for (String[] u : users) {
                    if (u[0].equalsIgnoreCase(userData[0])) {
                        u[1] = newPass;
                        break;
                    }
                }

                
                updateUsers(users);
                System.out.println("✅ Password changed successfully!");
            } else {
                System.out.println("✅ Continuing with old password.");
            }
        } else {
            System.out.println("❌ Backup key wrong. Returning to home.");
        }
    }

    
    static void createAccount() {
        try {
            boolean isNewFile = !new File(FILE_NAME).exists();
            List<String[]> users = isNewFile ? new ArrayList<>() : readUsers();
            Set<String> gmailNames = new HashSet<>();
            for (String[] u : users) gmailNames.add(u[0].toLowerCase());

            System.out.println("Please write @gmail.com at end, like: abc@gmail.com");
            System.out.print("Enter Gmail: ");
            String GMAIL = sc.nextLine().trim();
            if (!GMAIL.matches("^[A-Za-z0-9._%+-]+@gmail\\.com$")) {
                System.out.println("❌ NOT A VALID GMAIL");
                return;
            }
            if (gmailNames.contains(GMAIL.toLowerCase())) {
                System.out.println("⚠️ This Gmail already exists. Try again.");
                return;
            }

            System.out.println("Rules for password: at least 8 chars, uppercase, lowercase, number, symbol.");
            String PASSWORD = "";
            while (true) {
                System.out.print("Enter Password: ");
                PASSWORD = sc.nextLine().trim();
                if (isValidPassword(PASSWORD)) break;
                System.out.println("Password invalid. Try again.");
            }

            System.out.print("Enter Backup Key (for password recovery): ");
            String BACKUP_KEY = sc.nextLine().trim();

            try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
                if (isNewFile) writer.write("GMAIL,PASSWORD,BACKUP_KEY\n");
                writer.write(GMAIL + "," + PASSWORD + "," + BACKUP_KEY + "\n");
                System.out.println("✅ Account Created Successfully!");
            }

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    
    static List<String[]> readUsers() throws IOException {
        List<String[]> users = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        boolean skipHeader = true;
        while ((line = br.readLine()) != null) {
            if (skipHeader) { skipHeader = false; continue; }
            String[] parts = line.split(",");
            if (parts.length >= 3) users.add(new String[]{parts[0].trim(), parts[1].trim(), parts[2].trim()});
        }
        br.close();
        return users;
    }

    
    static String[] findUser(List<String[]> users, String gmail) {
        for (String[] user : users) if (user[0].equalsIgnoreCase(gmail)) return user;
        return null;
    }

    
    static void updateUsers(List<String[]> users) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write("GMAIL,PASSWORD,BACKUP_KEY\n");
            for (String[] u : users) writer.write(u[0] + "," + u[1] + "," + u[2] + "\n");
        }
    }

    
    static boolean isValidPassword(String pass) {
        return pass.length() >= 8
            && pass.matches(".*[A-Z].*")
            && pass.matches(".*[a-z].*")
            && pass.matches(".*[0-9].*")
            && pass.matches(".*[^a-zA-Z0-9].*");
    }

    
    static void openCSV() {
        try {
            File file = new File(FILE_NAME);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
                System.out.println("📂 Opening " + FILE_NAME + " ...");
            }
        } catch (Exception e) {
            System.out.println("⚠️ Could not open file automatically: " + e.getMessage());
        }
    }
}
