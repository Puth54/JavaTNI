package Banking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
        loadBalance();
    }

    private void loadBalance() {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accId)) {
                    accBalance = Double.parseDouble(data[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean hasAccountId() {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accId)) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private void updateFile() {

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[0].equals(accId)) {
                    lines.add(accId + "," + accBalance);
                } else {
                    lines.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposit(double amount) {
        accBalance += amount;
        updateFile();
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= accBalance) {
            accBalance -= amount;
            updateFile();
        }
    }

    @Override
    public double checkBalance() {
        return accBalance;
    }
}
