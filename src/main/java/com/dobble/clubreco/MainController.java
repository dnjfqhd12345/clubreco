package com.dobble.clubreco;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jdk.internal.org.jline.utils.Log;

@Controller("mainController")
public class MainController {
	
	static String username;

	
	@RequestMapping(value="/info" ,method=RequestMethod.GET)
	public ModelAndView info(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("info");
		return mav;
	}
	
	@RequestMapping(value="/userinfo", method=RequestMethod.GET)
	public ModelAndView userinfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userinfo");
		return mav;
	}
	@RequestMapping(value="/userinfo", produces = "text/plain;charset=UTF-8",method=RequestMethod.POST)
	public ModelAndView userinfoPOST(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String usernickname = request.getParameter("name");
		username = usernickname;
		mav.setViewName("survey");
		return mav;
	}

	
	@RequestMapping(value="/main1.do" ,method=RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "main1");
		mav.setViewName("main");
		return mav;

	}
	@RequestMapping(value="/result" ,method=RequestMethod.GET)
	public ModelAndView result(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		NameDAO dao = new NameDAO();
		List<NameVO> nameList = dao.selectEBMList();
		mav.addObject("nameList",nameList);
		mav.setViewName("result");
		return mav;

	}
	
	@RequestMapping(value="/main2.do", method=RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","main2");
		mav.setViewName("main");
		return mav;
	}
	@RequestMapping(value="/survey", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView survey(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("exercise".equals(selectedclub)) {
			mav.setViewName("exercise");
		} else if("study".equals(selectedclub)) {
			mav.setViewName("study");
		} else if("art".equals(selectedclub)) {
			mav.setViewName("art");
		} else if("volunteering".equals(selectedclub)) {
			mav.setViewName("volunteering");
		} else if("religious".equals(selectedclub)) {
			mav.setViewName("religious");
		} else {mav.setViewName("survey");}
		return mav;
	}
	/*
	@RequestMapping(value="/surveysubmit1", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if(selectedclub == "exercise") {
			mav.setViewName("survey2");
		} else if(selectedclub == "study") {
			mav.setViewName("survey3");
		}
		return mav;
	}
	*/
	@RequestMapping(value="/surveysubmit2", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("ball".equals(selectedclub)) {
			mav.setViewName("exercise1");
		} else if("body".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectEBList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("leisure".equals(selectedclub)) {
			mav.setViewName("exercise2");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit3", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("cooper".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectEBMList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			for(NameVO data: nameList) {
				System.out.println(data);
			}
			mav.setViewName("result");
		} else if("compete".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectEBEList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit4", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("summer".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectELSList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("winter".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectELWList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit5", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit5(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("language".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectSLList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("startup".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectSSUList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("study".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectSSTList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("it".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectSIList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit6", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit6(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("music".equals(selectedclub)) {
			mav.setViewName("art2");
		} else if("picture".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectAPList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("trip".equals(selectedclub)) {
			mav.setViewName("art4");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit7", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit7(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("yes".equals(selectedclub)) {
			mav.setViewName("art3");
		} else if("no".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectAMSList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit8", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit8(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("instrument".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectAMSIList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("dance".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectAMSDList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit9", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit9(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("yes".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectATSTList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("no".equals(selectedclub)) {
			mav.setViewName("art5");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit10", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit10(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("theater".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectATTList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("magic".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectATMList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("edit".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectATEList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("boardgame".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectATBList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit11", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit11(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("people".equals(selectedclub)) {
			mav.setViewName("volunteering2");
		} else if("animal".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVAList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("social".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVEList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit12", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit12(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("child".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVPCList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("student".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVPSList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("old".equals(selectedclub)) {
			mav.setViewName("volunteering3");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit13", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit13(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("yes".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVPOSList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("no".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectVPOList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit14", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit14(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		NameDAO dao = new NameDAO();
		if("christian".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectRCList();
			for(NameVO data: nameList) {
				System.out.println(data);
			}
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} else if("buddhism".equals(selectedclub)) {
			List<NameVO> nameList = dao.selectRBList();
			mav.addObject("nameList",nameList);
			mav.addObject("username",username);
			mav.setViewName("result");
		} 
		return mav;
	}
}