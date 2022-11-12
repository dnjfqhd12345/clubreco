package com.dobble.clubreco;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class NameDAO {
	public static SqlSessionFactory sqlMapper = null;

	private static SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				String resource = "./SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
				System.out.println("DB연결 성공!");
			} catch (Exception e) {
				System.out.println("DB연결 실패" + e);
				e.printStackTrace();
			}
		}
		return sqlMapper;

	}

	public List<NameVO> selectEBMList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectEBMList");
		return namelist;
	}
	
//	 public List<HashMap<String, String>> selectAllMemberList() { 
//		sqlMapper = getInstance(); 
//     	SqlSession session = sqlMapper.openSession();
//		List<HashMap<String, String>> memlist = null; 
//   	memlist = session.selectList("mapper.member.selectAllMemberList"); 
//		return memlist; 
//	 }
	
}
