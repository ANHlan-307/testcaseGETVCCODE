package com.company;

public class TestCase5 {
    public static void Unittest() throws Exception{
        System.out.println("Test case 5: Phonenumber invalid");
        String phonenumber = "9745538291";
        ResponseGetVCAPI res = getvcAPI.callAPI(phonenumber);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();

        System.out.println("Finished!");
    }
}
