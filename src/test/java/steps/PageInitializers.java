package steps;

import pages.*;

public class PageInitializers {

    public static a_LoginPage login;
    public static b_EmployeeSearchPage employeeSearchPage;
    public static c_AddEmployeePage addEmployeePage;
    public static d_DashboardPage dashboardPage;

    public static e_AddLanguagePage addLanguagePage;
    public static f_GonkiPage gonkiPage;

    public static void initializePageObjects(){
        login = new a_LoginPage();
        employeeSearchPage = new b_EmployeeSearchPage();
        addEmployeePage = new c_AddEmployeePage();
        dashboardPage = new d_DashboardPage();
        addLanguagePage = new e_AddLanguagePage();
        gonkiPage = new f_GonkiPage();

    }



}
