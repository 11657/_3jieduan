import com.qf.dao.chuliDao;
import com.qf.pojo.chuli;
import com.qf.service.chuliService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ts1 {
@Autowired
chuliService cs;

    @Test
    public void te12(){
//        Map<String, Object> map = new HashMap<>();
//        map.put("cname","p30");
        List<chuli> p = cs.getAllchuli();
        for (chuli c:
                p ) {
            System.out.println(c);
        }
    }
}
