package com.FieldConnect.AgriNetwork.Utils;

import com.FieldConnect.AgriNetwork.Bean.BankDetailsBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;

import java.lang.instrument.Instrumentation;
import java.util.Map;

public class RecieveData {


    //	public static void premain(String args, Instrumentation inst) {
//		instrumentation = inst;
//	}
//
//	public static long getObjectSize(Object o) {
//		return instrumentation.getObjectSize(o);
//	}


    private static Instrumentation instrumentation;

    public static String data(ResponseEntity response){
        String result = null;
        System.out.println("Inside Receive Data--------------->>");
        System.out.println(response);

        ResponseEntity<BankDetailsBean> responseEntity = response;
        BankDetailsBean bankDetailsBean = responseEntity.getBody();

        System.out.println("Bank Details : " + bankDetailsBean);

//		Long length = getObjectSize(bankDetailsBean);
//		System.out.println("BankDetailsBean---------------->>" + length);

        ObjectMapper oMapper = new ObjectMapper();

        Map<String, Object> map = oMapper.convertValue(bankDetailsBean, Map.class);
        System.out.println("After Conversation of Map : " + map);

        if (bankDetailsBean.getBANK() != null){
            System.out.println("NotEmpty");
            result =  "NotEmpty";
        }else {
            result =  "Empty";
        }
        System.out.println(responseEntity);

        return result;
    }
}
