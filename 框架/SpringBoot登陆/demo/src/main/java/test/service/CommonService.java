package test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.mapper.Common;

@Service
public class CommonService {
    @Autowired
    public Common commonmapper;
    public String login(String sno, String password){
        return commonmapper.login(sno, password);
    }
}