/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medsigntesting;

import Business.Person.Person;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Alex
 */
public class MedSignTesting {

    private static UserAccountDirectory userAccountList = new UserAccountDirectory();
    private static int caseNumber = 1;

    private static void initiate() {
        Person p1 = new Person();
        p1.setFirstName("person1");
        p1.setLastName("person1");
        p1.setEmail("accountOk");
        p1.setSsn("111223335");

        UserAccount ua1 = userAccountList.addUserAccount();
        ua1.setPerson(p1);
        ua1.setRole(new AdminRole());
        ua1.setAccountName("accountOk");
        ua1.setPassword("passwordOk");
        ua1.setIsActive(true);
    }

    private static void test(String accountName, String password, boolean expected) {
        try {
            UserAccount ua = userAccountList.authenticate(accountName, password);
            if (expected == true) {
                System.out.println(String.format("[%s][%s][%s][%s][%s]",
                        String.valueOf(caseNumber++),
                        ua == null ? "Fail" : "Pass",
                        "Have this account/password match",
                        ua == null ? "Don't have this match" : "Have this match",
                        accountName + "," + password
                ));
            } else {
                System.out.println(String.format("[%s][%s][%s][%s][%s]",
                        String.valueOf(caseNumber++),
                        ua == null ? "Pass" : "Fail",
                        "Don't have this account/password match",
                        ua == null ? "Don't have this match" : "Have this match",
                        accountName + "," + password
                ));
            }
        } catch (Exception ex) {
            System.out.println("Exception occur");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initiate();
        test("accountOk", "passwordOk", true);
        test("account2", "password2", false);
        test(null, null, false);
    }

}
