package com.company;

public class TestCase4 {
    public static void Unittest() throws Exception{
        System.out.println("Test case 4: Phonenumber has not been in the DB");
        String phonenumber = "0971053829";
        ResponseGetVCAPI res = getvcAPI.callAPI(phonenumber);
        if ((!"1004".equals(res.code))||(!"9995".equals(res.code))) throw new AssertionError();
        System.out.println("Finished");
    }
}
