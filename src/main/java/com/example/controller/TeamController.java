package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	
	
	/**
	 * チーム一覧を表示する
	 * @param model リクエストパラメーター
	 * @return チームリスト
	 */
	@RequestMapping("/teamList")
    public String teamList(Model model) {
		model.addAttribute("teamList",teamService.showList());
		return "team/teamList";
	}
	
	/**
	 * チーム情報を表示
	 * @param id ID
	 * @param model リクエストパラメーター
	 * @return チーム詳細
	 */
	@RequestMapping("/teamDetail")
	public String showDetail(String id,Model model) {
		model.addAttribute("teamDetail",teamService.showDetail(Integer.parseInt(id)));
		return "team/teamDetail";
	}
}
