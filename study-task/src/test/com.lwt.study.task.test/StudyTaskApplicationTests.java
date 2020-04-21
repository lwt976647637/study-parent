import com.lwt.study.core.spider.service.SpiderService;
import com.lwt.study.task.StudyTaskApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyTaskApplication.class)
public class StudyTaskApplicationTests {

	@Autowired
	private SpiderService spiderService;

	@Test
	public void contextLoads() {
		try {
			spiderService.getDownloadMeme("http://www.bbsnet.com");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    @Test
    public void funnyVideo() {
        try {
            spiderService.downloadfunnyVideo("https://www.gaoxiaovod.com/zt/gaoxiaoshipin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void funnyDyttVideo() {
        try {
            spiderService.downloadDyttVideo("https://www.dytt8.net/html/gndy/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
