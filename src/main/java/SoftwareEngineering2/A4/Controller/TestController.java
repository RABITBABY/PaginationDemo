package SoftwareEngineering2.A4.Controller;

import SoftwareEngineering2.A4.POJO.Test;
import SoftwareEngineering2.A4.Service.TestService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "getAll")
    @ResponseBody
    public List<Test> getAll(int pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Test> testList=this.testService.getAll();
        return testList;
    }
}
