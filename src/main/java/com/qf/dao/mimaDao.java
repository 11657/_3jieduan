package com.qf.dao;

import com.qf.pojo.mima;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface mimaDao {
    public List<mima> mimalist();
    public mima getmima(String name);
}
