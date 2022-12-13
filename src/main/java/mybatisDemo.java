import com.itheima.mapper.CharactorMapper;
import com.itheima.mapper.WeaponMapper;
import com.itheima.pojo.Charactor;
import com.itheima.pojo.Weapon;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisDemo {

    public static void main(String[] args) throws IOException {
//        加载核心配置文件，获取sqlseesion对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取SQL session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        执行sql
      //  List<Object> charactors = sqlSession.selectList("test.selectAll");
        //CharactorMapper mapper = sqlSession.getMapper(CharactorMapper.class);
        WeaponMapper weaponmapper = sqlSession.getMapper(WeaponMapper.class);
        List<Weapon> weapons = weaponmapper.selectAllweapon();

        System.out.println(weapons);

sqlSession.close();
    }


}
