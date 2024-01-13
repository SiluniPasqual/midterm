/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BloodPressureMonitor;

/**
 *
 * @author siluni
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author silun
 */
public class BloodPressureTester {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<BloodPressureRecord> records = new ArrayList<>();
        boolean running = true;
        
        Scanner scanner = new Scanner(System.in);
        
        while (running){
            displayMenu();
            int input = scanner.nextInt();
            
            switch (input) {
                case 0:
                    running = exitProgram();
                    break;
                case 1:
                    createRecord(records);
                    break;
                case 2:
                    System.out.println("Blood Pressure Records...");
                    System.out.println("");
                    displayRecords(records);
                    break;
                case 3:
                    System.out.println("Enter the record number: ");
                    int recordNum = scanner.nextInt();
                    System.out.println("Record " + recordNum + " Details");
                    viewRecordDetails(records, recordNum);
                    break;
                case 4:
                    clearRecords(records);
                    break;
            
            }
        }
    }
    
    /**
     *
     */
    public static void displayMenu() {
        System.out.println("Menu...");
        System.out.println("1. Create a Record");
        System.out.println("2. Show all users");
        System.out.println("3. Select a user");
        System.out.println("4. Delete all");
        System.out.println("0. Exit");
    }
    
    /**
     *
     * @param recordList
     */
    public static void displayRecords(ArrayList<BloodPressureRecord> recordList) {
        for (int i = 0; i < recordList.size(); i++) {
            recordList.get(i).display();
        }
    }

    /**
     *
     * @return
     */
    public static boolean exitProgram() {
        return false;
    }

    /**
     *
     * @param recordList
     */
    public static void createRecord(ArrayList<BloodPressureRecord> recordList) {
        System.out.println("How many users do you want to create?");
        Scanner scanner = new Scanner(System.in);
        int create = scanner.nextInt();
        
        for(int i = 0; i < create; i++ ) {
            Scanner sc =new Scanner(System.in);
            
            System.out.println("Enter User ID: ");
            int id = sc.nextInt();
				
            System.out.println("Enter User Name: ");
            String user_name = sc.next();
				
            System.out.println("Enter User's Year of Birth:");
            int birthYear = sc.nextInt();
				
            System.out.println("Enter User Systolic blood pressure: ");
            int systolic = sc.nextInt();
				
            System.out.println("Enter User Diastolic blood pressure: ");
            int diastolic = sc.nextInt();
				
            recordList.add(new BloodPressureRecord(id,user_name,birthYear,systolic,diastolic));			
	}
    }

    /**
     *
     * @param recordList
     * @param recordNumber
     */
    public static void viewRecordDetails(ArrayList<BloodPressureRecord> recordList, int recordNumber) {
        recordList.get(recordNumber-1).display();
    }

    /**
     *
     * @param recordList
     */
    public static void clearRecords(ArrayList<BloodPressureRecord> recordList) {
        recordList.clear();
    }
 }


