package jp.co.sss.sys.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.co.sss.sys.entity.Employee;
import jp.co.sss.sys.form.LoginForm;
import jp.co.sss.sys.repository.EmployeeRepository;



@Controller
@SessionAttributes(types = Employee.class) 
public class IndexController {

	@Autowired
	EmployeeRepository empRepository;
	LoginForm loginform;
	/**
	 * ログイン画面を表示する
	 * @param loginForm
	 * @return login.html
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login( LoginForm loginForm,BindingResult br,Model model) {
		return "login";
	}
	@Autowired
	HttpSession session;

	// 処理
	/**
	 * 入力された値を元にログイン認証し、トップ画面に遷移する
	 *
	 * @param req
	 * @param res
	 * @param loginForm 
	 * @return top.html
	 */
	@RequestMapping(path = "/top", method = RequestMethod.POST)
	public String login(@Validated LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) {
		//ログインした人の情報
		String empId = req.getParameter("empId");
		String password = req.getParameter("password");

		Employee employee = empRepository.findByEmpIdAndPassword(empId, password);

		//セッションデータ設定
		session.setAttribute("userInfo",employee);
		model.addAttribute("employee",employee);

		//ログインチェック
		if(employee == null) {
			//存在しない場合
			return "login";

		}else {
			//存在した場合
			//社員情報一覧
			List<Employee> empAll= empRepository.findAll();    
			model.addAttribute("empAll",empAll);

			return "top";

		}
	}

	@RequestMapping(path = "/top", method = RequestMethod.GET)
	public String top(@Validated LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) {
		List<Employee> empAll= empRepository.findAll();    
		model.addAttribute("empAll",empAll);

		return "top";

	}




	@RequestMapping(path = "/mypage", method = RequestMethod.POST)
	public String empUser(@Validated LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) throws ParseException   {
		session = req.getSession();

		String empName = req.getParameter("empName");
		String password = req.getParameter("password");
		String date =  req.getParameter("birthday");
		String savegender = req.getParameter("gender");





		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdFormat.parse(date);

		int gender = Integer.parseInt(savegender);


		Employee userInfoUpdate = (Employee) session.getAttribute("updateUser");
		userInfoUpdate.setEmpName(empName);
		userInfoUpdate.setPassword(password);
		userInfoUpdate.setBirthday(birthday);
		userInfoUpdate.setGender(gender);


		Employee updateEmployee = empRepository.save(userInfoUpdate);
		model.addAttribute("updateUser",updateEmployee);



		return "/mypage";
	}

	// TODO 自動生成されたメソッド・スタブ

	@RequestMapping(path = "/mypage", method = RequestMethod.GET)
	public String empLink(LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) {
		session = req.getSession();
		Object userInfo=session.getAttribute("updateUser");

		model.addAttribute("updateUser",userInfo);
		return "/edit_fin";
	}

//	@RequestMapping(path ="/edit_fin", method = RequestMethod.POST)
//	public String empBack(@RequestParam("empName") String empName,@RequestParam("password") String password,@RequestParam("bithday") String birthday,@RequestParam("gender") String gender, @Validated LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) {
//		session = req.getSession();
//
//		
//
//		
//		return "edit_fin";
//	}
//	@RequestMapping(path = "/edit_fin", method = RequestMethod.GET)
//	public String edit(@RequestParam("empName") String empName,@RequestParam("password") String password,@RequestParam("bithday") String birthday,@RequestParam("gender") String gender, @Validated LoginForm loginForm, HttpServletRequest req, HttpServletResponse res,BindingResult br,Model model,HttpSession session) {
//		session = req.getSession();
//		model.addAttribute("userInfo1",empName);
//		model.addAttribute("userInfo2",password);
//		model.addAttribute("userInfo3",birthday);
//		model.addAttribute("userInfo4",gender);
//		
//		return "edit_fin";
//	
//}
}







