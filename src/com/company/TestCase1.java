package com.company;

public class TestCase1 {
    public static void Unittest() throws Exception{
        System.out.println("Get verify code success");
        String phonenumber = "0974553829";
        ResponseGetVCAPI res = getvcAPI.callAPI(phonenumber);
        if ((!"1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }

}
