package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IpClassCheck {
    public static void main(String[] args) {
        IpClassCheck ip = new IpClassCheck();

        String ipAddr = "192.180.0.1";
        ip.ipClassCheck(ipAddr);
    }

    public static String ipClassCheck(String ipAddr){
        String[] ipNumS = ipAddr.split("\\.");
        int[] ipNum = valueOfList(ipNumS);

//        System.out.println(Arrays.toString(ipNum);
        for(int i:ipNum){
            if(i<255){


            }else
                throw new IllegalArgumentException("Input only 0~255");
        }

        return null;
    }
    public static int[] valueOfList(String[] strings){
        int[] ints = new int[4];

        for(int i=0; i<strings.length; i++){
            ints[i] = (int) Integer.valueOf(strings[i]);
        }
        return ints;
    }
}
