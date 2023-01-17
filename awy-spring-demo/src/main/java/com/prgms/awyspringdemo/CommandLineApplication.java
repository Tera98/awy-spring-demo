package com.prgms.awyspringdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class CommandLineApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Voucher Program ===\n" +
                "Type exit to exit the program.\n" +
                "Type create to create a new voucher.\n" +
                "Type list to list all vouchers.");

        String str = br.readLine();
        if(str.equals("create")){
            UUID id = UUID.randomUUID();
            int amount = 0;
            Voucher voucher = new FixedAmountVoucher(id, amount);
        } else if(str.equals("list")){

        }

    }
}
