package com.qf.service;

import com.qf.pojo.mima;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface mimaService {
    List<mima> mimalist();
    public mima getmima(String name);
}
