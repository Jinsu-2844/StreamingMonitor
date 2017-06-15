/**
 * @Package Name   : com.mwstory.streamingmonitor.Controller
 * @FileName  : IndexController.java
 * @�ۼ���       : 2017. 6. 14. 
 * @�ۼ���       : ������
 * @���α׷� ���� : 
 */


package com.mwstory.streamingmonitor.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("����ȭ��, �α���.do ������ ���� ����!!", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "login";
	}
	
	@RequestMapping(value = "index.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("�ε���.do ������ ���� ����!!", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	
	@RequestMapping(value = "index.do", method = RequestMethod.POST)
	public String home1(Locale locale, Model model) {
		logger.info("�ε���.do ������ ���� ����!!", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	
	@RequestMapping(value = "collectinglist.do", method = RequestMethod.GET)
	public String collectingList(Locale locale, Model model) {
		logger.info("collectinglist.do ������ ���� ����!!", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "collectingList";
	}
	
	@RequestMapping(value = "crawerstatus.do", method = RequestMethod.GET)
	public String crawerStatus(Locale locale, Model model) {
		logger.info("crawerStatus.do ������ ���� ����!!", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "crawerStatus";
	}

	
	
	
	
}
