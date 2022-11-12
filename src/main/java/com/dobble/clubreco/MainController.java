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
	@RequestMapping(value="/info" ,method=RequestMethod.GET)
	public ModelAndView info(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("info");
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
		
		Log.debug("mav : " + mav);
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
		if("ball".equals(selectedclub)) {
			mav.setViewName("exercise1");
		} else if("body".equals(selectedclub)) {
			mav.addObject("body");
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
			System.out.println(mav.toString());
			mav.setViewName("result");
		} else if("compete".equals(selectedclub)) {
			mav.addObject("compete");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit4", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("summer".equals(selectedclub)) {
			mav.addObject("summer");
			mav.setViewName("result");
		} else if("winter".equals(selectedclub)) {
			mav.addObject("winter");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit5", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit5(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("language".equals(selectedclub)) {
			mav.addObject("language");
			mav.setViewName("result");
		} else if("startup".equals(selectedclub)) {
			mav.addObject("startup");
			mav.setViewName("result");
		} else if("study".equals(selectedclub)) {
			mav.addObject("study");
			mav.setViewName("result");
		} else if("it".equals(selectedclub)) {
			mav.addObject("it");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit6", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit6(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("music".equals(selectedclub)) {
			mav.setViewName("art2");
		} else if("picture".equals(selectedclub)) {
			mav.addObject("picture");
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
		if("yes".equals(selectedclub)) {
			mav.setViewName("art3");
		} else if("no".equals(selectedclub)) {
			mav.addObject("no");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit8", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit8(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("instrument".equals(selectedclub)) {
			mav.addObject("instrument");
			mav.setViewName("result");
		} else if("dance".equals(selectedclub)) {
			mav.addObject("dance");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit9", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit9(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("yes".equals(selectedclub)) {
			mav.addObject("yes");
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
		if("theater".equals(selectedclub)) {
			mav.addObject("theater");
			mav.setViewName("result");
		} else if("magic".equals(selectedclub)) {
			mav.addObject("magic");
			mav.setViewName("result");
		} else if("edit".equals(selectedclub)) {
			mav.addObject("edit");
			mav.setViewName("result");
		} else if("boardgame".equals(selectedclub)) {
			mav.addObject("boardgame");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit11", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit11(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("people".equals(selectedclub)) {
			mav.setViewName("volunteering2");
		} else if("animal".equals(selectedclub)) {
			mav.addObject("animal");
			mav.setViewName("result");
		} else if("social".equals(selectedclub)) {
			mav.addObject("social");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit12", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit12(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("child".equals(selectedclub)) {
			mav.addObject("child");
			mav.setViewName("result");
		} else if("student".equals(selectedclub)) {
			mav.addObject("student");
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
		if("yes".equals(selectedclub)) {
			mav.addObject("yes");
			mav.setViewName("result");
		} else if("no".equals(selectedclub)) {
			mav.addObject("no");
			mav.setViewName("result");
		}
		return mav;
	}
	@RequestMapping(value="/surveysubmit14", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView surveysubmit14(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String selectedclub = request.getParameter("selectedclub");
		if("christian".equals(selectedclub)) {
			mav.addObject("christian");
			mav.setViewName("result");
		} else if("buddhism".equals(selectedclub)) {
			mav.addObject("buddhism");
			mav.setViewName("result");
		} 
		return mav;
	}
}