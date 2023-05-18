package steps;

import pages.c_AddEmployeePage;
import pages.d_DashboardPage;
import pages.b_EmployeeSearchPage;
import pages.a_LoginPage;

public class PageInitializers {

    public static a_LoginPage login;
    public static b_EmployeeSearchPage employeeSearchPage;
    public static c_AddEmployeePage addEmployeePage;
    public static d_DashboardPage dDashboardPage;

    public static void initializePageObjects(){
        login = new a_LoginPage();
        employeeSearchPage = new b_EmployeeSearchPage();
        addEmployeePage = new c_AddEmployeePage();
        dDashboardPage = new d_DashboardPage();

    }



}
