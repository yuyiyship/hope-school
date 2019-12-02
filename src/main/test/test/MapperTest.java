//import com.yship.config.SpringConfig;
//import com.yship.mapper.StudentMapper;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
///**
// * @ClassName: MapperTest
// * @Description: TODO
// * @Author: Yship
// * @Date: 2019/11/13 14:04
// * @Version: 1.0.0
// */
//public class MapperTest {
//	@Test
//	public void studnetSelectByPrimaryKey() {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext =
//				new AnnotationConfigApplicationContext(SpringConfig.class);
//		StudentMapper studnetMapper = (StudentMapper) annotationConfigApplicationContext.getBean("studnetMapper");
//		Student student = studnetMapper.selectByPrimaryKey(1);
//		System.out.println(student);
//	}
//}
