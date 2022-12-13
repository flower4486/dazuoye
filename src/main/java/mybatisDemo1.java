import com.itheima.mapper.AccessoriesMapper;
import com.itheima.mapper.WeaponMapper;
import com.itheima.pojo.Accessories;
import com.itheima.pojo.Weapon;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisDemo1 {

    public static void main(String[] args) throws IOException {
//        加载核心配置文件，获取sqlseesion对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取SQL session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        执行sql
        AccessoriesMapper accessoriesMapper = sqlSession.getMapper(AccessoriesMapper.class);

        List<Accessories> accessories = accessoriesMapper.selectAllaccessories();
        System.out.println(accessories);

sqlSession.close();
    }


}
