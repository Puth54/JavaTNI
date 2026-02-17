package Banking;

import java.io.*;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    public boolean isExistingAccount(String accountName) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accountName)) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public String recordAccount() {

        if (isExistingAccount(accId)) {
            return "This account has been created!!";
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {

            bw.write(super.toString());
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Created account success!!";
    }
}
