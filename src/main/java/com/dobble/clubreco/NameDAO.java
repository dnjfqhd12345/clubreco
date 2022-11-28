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
				System.out.println("DB 연결 성공!");
			} catch (Exception e) {
				System.out.println("DB 연결 실패" + e);
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
	
	public List<NameVO> selectEBEList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectEBEList");
		return namelist;
	}
	
	public List<NameVO> selectEBList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectEBList");
		return namelist;
	}
	
	public List<NameVO> selectELSList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectELSList");
		return namelist;
	}
	
	public List<NameVO> selectELWList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectELWList");
		return namelist;
	}
	
	public List<NameVO> selectSLList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectSLList");
		return namelist;
	}
	
	public List<NameVO> selectSSUList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectSSUList");
		return namelist;
	}
	
	public List<NameVO> selectSSTList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectSSTList");
		return namelist;
	}
	
	public List<NameVO> selectSIList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectSIList");
		return namelist;
	}
	
	public List<NameVO> selectAMSIList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectAMSIList");
		return namelist;
	}
	
	public List<NameVO> selectAMSDList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectAMSDList");
		return namelist;
	}
	
	public List<NameVO> selectAMSList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectAMSList");
		return namelist;
	}
	
	public List<NameVO> selectAPList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectAPList");
		return namelist;
	}
	
	public List<NameVO> selectATSTList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectATSTList");
		return namelist;
	}
	
	public List<NameVO> selectATTList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectATTList");
		return namelist;
	}
	
	public List<NameVO> selectATMList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectATMList");
		return namelist;
	}
	
	public List<NameVO> selectATEList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectATEList");
		return namelist;
	}
	
	public List<NameVO> selectATBList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectATBList");
		return namelist;
	}
	
	public List<NameVO> selectVPCList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVPCList");
		return namelist;
	}
	
	public List<NameVO> selectVPSList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVPSList");
		return namelist;
	}
	
	public List<NameVO> selectVPOSList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVPOSList");
		return namelist;
	}
	public List<NameVO> selectVPOList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVPOList");
		return namelist;
	}
	public List<NameVO> selectVAList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVAList");
		return namelist;
	}
	public List<NameVO> selectVEList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectVEList");
		return namelist;
	}
	public List<NameVO> selectRCList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectRCList");
		return namelist;
	}
	public List<NameVO> selectRBList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<NameVO> namelist = null;
		namelist = session.selectList("mapper.name.selectRBList");
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
