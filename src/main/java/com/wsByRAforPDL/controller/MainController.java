package com.wsByRAforPDL.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wsByRAforPDL.model.EmpRestURIConstants;
import com.wsByRAforPDL.model.EsubSoaModel;;

@Controller
public class MainController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "denied";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "logout";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listEmployees(ModelMap map) {
		return "editEmployeeList";
	}
	
	@RequestMapping("/home")
	public String Main(ModelMap model) {
		ArrayList<EsubSoaModel> listdb = new ArrayList<EsubSoaModel>();
		String[] dbName = EmpRestURIConstants.DBNAME;
		String[] dbServer = EmpRestURIConstants.DB;

		for (int i = 0; i < dbName.length; i++) {
			EsubSoaModel dbModel = new EsubSoaModel();
			dbModel.setDbName(dbName[i]);
			dbModel.setDbServer(dbServer[i]);
			listdb.add(dbModel);
		}
		model.addAttribute("webURL", listdb);

		return "home";
	}
}