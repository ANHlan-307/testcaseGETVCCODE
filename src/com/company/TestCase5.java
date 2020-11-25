package com.company;

public class TestCase5 {
    public static void Unittest() throws Exception{
        System.out.println("Test case 5: Phonenumber invalid");
        String phonenumber = "9745538291";
        char comp = phonenumber.charAt(0);
        if(!("0".equals(comp)) || !(phonenumber.length()==9)){
            System.out.println("Phonenumber is invalid: not satisfied length or not begin with 0");
        } else {
            ResponseGetVCAPI res = getvcAPI.callAPI(phonenumber);
            if ((!"1004".equals(res.code))) throw new AssertionError();
        }
        System.out.println("Finished!");
    }
}
