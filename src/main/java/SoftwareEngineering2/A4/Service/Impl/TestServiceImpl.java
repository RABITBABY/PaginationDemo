package SoftwareEngineering2.A4.Service.Impl;

import SoftwareEngineering2.A4.DAO.TestDAO;
import SoftwareEngineering2.A4.POJO.Test;
import SoftwareEngineering2.A4.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDAO testDAO;

    @Override
    public List<Test> getAll() {
        return this.testDAO.selectAll();
    }
}
