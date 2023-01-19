package com.prgms.awyspringdemo.voucher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.UUID;

@Service
public class VoucherService {

    @Autowired
    private VoucherRepository voucherRepository;

  //  public VoucherService(VoucherRepository voucherRepository) {
  //      this.voucherRepository = voucherRepository;
  //   }


    public void useVoucher(Object voucher) {
    }

    public Voucher getVoucher(UUID voucherId) {
        return voucherRepository
                .findById(voucherId)
                .orElseThrow(() -> new RuntimeException(MessageFormat.format("Can no find a voucher for {0}", voucherId)));
    }

    @Autowired
    public void setVoucherRepository(VoucherRepository voucherRepository) {
        this.voucherRepository = voucherRepository;
    }
}
