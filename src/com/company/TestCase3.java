package com.company;

public class TestCase3 {
    public static void Unittest() throws Exception{
        System.out.println("Test case 3: Verifying has been done before");
        String phonenumber = "0974553829";
        ResponseGetVCAPI res1 = getvcAPI.callAPI(phonenumber);
        ResponseGetVCAPI res2 = getvcAPI.callAPI(phonenumber);
        if ((!"1010".equals(res2.code))) throw new AssertionError();
        System.out.println("Finished");
    }
}
